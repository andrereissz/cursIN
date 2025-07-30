package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ConsultarCursosController {

    public static ArrayList<Curso> executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        TextFieldInterface tfId = (TextFieldInterface) mapa.get("tfId");
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");

        ArrayList<Curso> cursos = new ArrayList();

        if ((tfId.getText().isBlank() == true || tfId.getText().isEmpty() == true)
                && (tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)) {
            try {
                CursoDao cdao = new CursoDao();
                if (cdao.buscarNome(tfNome.getText()) == null) { 
                    tfNome.setText("");
                    tfId.setText("");
                    JOptionPane.showMessageDialog(null, "Não existe curso com o nome: "+tfNome.getText(), null, JOptionPane.ERROR_MESSAGE);
                    return null;
                }
                cursos = (ArrayList) cdao.buscarNome(tfNome.getText());
            } catch (SQLException | DAOException ex) {
                System.out.println(ex);
            }
        }
        if ((tfId.getText().isBlank() == false || tfId.getText().isEmpty() == false)) {
            try {
                CursoDao adao = new CursoDao();
                if (adao.buscarId(Integer.valueOf(tfId.getText())) == null) {
                    tfNome.setText("");
                    tfId.setText("");
                    JOptionPane.showMessageDialog(null, "Não existe curso com o id: " + tfId.getText(), null, JOptionPane.ERROR_MESSAGE);
                    return null;
                }
                cursos = (ArrayList) adao.buscarId(Integer.valueOf(tfId.getText()));
            } catch (SQLException | DAOException ex) {
                System.out.println(ex);
            }
        }
        tfNome.setText("");
        tfId.setText("");
        return cursos;
    }
}
