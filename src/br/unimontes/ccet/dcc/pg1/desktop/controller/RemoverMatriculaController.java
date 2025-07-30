package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.LabelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class RemoverMatriculaController {

    public static ArrayList<Curso> executa(PainelInterface view) {
        HashMap<String, Component> mapa = view.getMapComponentes();
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        LabelInterface labelAux = (LabelInterface) mapa.get("labelAux");
        LabelInterface labelAux2 = (LabelInterface) mapa.get("labelAux2");
        LabelInterface labelCreditos = (LabelInterface) mapa.get("labelCreditos");
        LabelInterface cont = (LabelInterface) mapa.get("cont");

        AlunoCurso temp = new AlunoCurso(tfCpf.getText(), Integer.valueOf(labelAux.getText()));

        ArrayList<Curso> cursos = new ArrayList();

        try {
            AlunoCursoDao acdao = new AlunoCursoDao();
            cursos = acdao.buscaCursosMatriculadosExceto(temp);
            acdao.delete(temp);
        } catch (DAOException | SQLException ex) {
            System.out.println(ex);
        }

        Integer valortotal = 0;
        labelCreditos.setText("TOTAL CRÉDITOS:");
        for (Curso curso : cursos) {
            valortotal += curso.getCreditos();
        }
        cont.setText(valortotal.toString());
        JOptionPane.showMessageDialog(null, "DESMATRICULADO COM SUCESSO!\nCPF: "+tfCpf.getText()+"\nCURSO: "+labelAux2.getText(), null, JOptionPane.INFORMATION_MESSAGE);
        return cursos;
    }
}
