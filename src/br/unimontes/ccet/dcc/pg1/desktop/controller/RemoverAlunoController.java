package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import java.sql.SQLException;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class RemoverAlunoController {
    public static void executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        
        int i = 0;
        Aluno aluno = new Aluno(tfCpf.getText());
        AlunoCurso alunocurso = new AlunoCurso(tfCpf.getText());
        
        try{
            AlunoDao adao = new AlunoDao();
            adao.delete(aluno);
            i++;
        }
        catch(SQLException | DAOException ex){
            System.out.println(ex);
        }
        
        try{
            AlunoCursoDao acdao = new AlunoCursoDao();
            acdao.deleteTodasMatriculas(alunocurso);
            i++;
        }
        catch(SQLException | DAOException ex){
            System.out.println(ex);
        }
        if(i == 2){
            JOptionPane.showMessageDialog(null, "Aluno removido com sucesso", null, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
