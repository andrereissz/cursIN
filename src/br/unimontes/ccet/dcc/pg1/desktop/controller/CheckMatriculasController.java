package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CheckMatriculasController {
    public static boolean executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");

        try{
            AlunoCurso alunocurso = new AlunoCurso(tfCpf.getText());
            AlunoCursoDao acdao = new AlunoCursoDao();
            if(acdao.verificaMatriculaCpf(alunocurso) == false){
                tfCpf.setText("");
                JOptionPane.showMessageDialog(null,"ALUNO NÃO ESTÁ MATRICULADO EM NENHUM CURSO!",null,JOptionPane.ERROR_MESSAGE);          
                return false;
            }
        }
        catch(DAOException | SQLException ex){System.out.println(ex);}
        return true;
    }
}
