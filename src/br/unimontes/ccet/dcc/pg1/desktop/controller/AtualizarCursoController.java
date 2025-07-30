package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class AtualizarCursoController {

    public static void executa(PainelInterface view) {
        HashMap<String, Component> mapa = view.getMapComponentes();

        TextFieldInterface tfId = (TextFieldInterface) mapa.get("tfId");
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");
        TextFieldInterface tfCreditos = (TextFieldInterface) mapa.get("tfCreditos");
        Curso temp = new Curso(Integer.valueOf(tfId.getText()), tfNome.getText(), Integer.valueOf(tfCreditos.getText()));
        try {
            CursoDao cdao = new CursoDao();
            if (cdao.verificaNome(temp) == false) {
                if (cdao.update(new Curso(Integer.valueOf(tfId.getText()), tfNome.getText(), Integer.valueOf(tfCreditos.getText()))) == 1) {
                    tfId.setText("");
                    tfNome.setText("");
                    tfCreditos.setText("");
                    JOptionPane.showMessageDialog(null, "Curso atualizado com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
                    try {
                        AlunoCursoDao acdao = new AlunoCursoDao();
                        acdao.updateMatriculaCurso(new AlunoCurso(temp.getId(), temp.getCreditos()));
                    } catch (DAOException | SQLException ex) {
                        System.out.println(ex);
                    }
                }
            } else {
                tfId.setText("");
                tfNome.setText("");
                tfCreditos.setText("");
                JOptionPane.showMessageDialog(null, "Ja existe um curso com esse nome!", null, JOptionPane.ERROR_MESSAGE);
            }
        } catch (DAOException | SQLException ex) {
            System.out.println(ex);
        }
    }
}
