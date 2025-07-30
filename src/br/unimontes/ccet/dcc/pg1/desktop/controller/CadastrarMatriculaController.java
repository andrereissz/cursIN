package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ComboBoxInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CadastrarMatriculaController {
    public static int executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        int result = 0;
        Curso temp = new Curso(0);
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        ComboBoxInterface selectCurso = (ComboBoxInterface) mapa.get("selectCurso");
        
        //curso temporario para conseguir o ID curso só com o nome
        try{
            CursoDao tempdao = new CursoDao();
            temp = tempdao.buscaNome(selectCurso.getSelectedItem().toString());
        }
        catch(DAOException | SQLException ex){System.out.println(ex);} 
        
        try{
            AlunoCurso alunocurso = new AlunoCurso(tfCpf.getText(),temp.getId(), temp.getCreditos());
            AlunoCursoDao acdao = new AlunoCursoDao();
            result = acdao.save(alunocurso);
            if(result == 2){
                JOptionPane.showMessageDialog(null,"ALUNO JÁ CADASTRADO NESSE CURSO!",null,JOptionPane.ERROR_MESSAGE);            
                return 1;
            }
            alunocurso.setCreditosCursados(temp.getCreditos());
        }
        catch(DAOException | SQLException ex){System.out.println(ex);}
        JOptionPane.showConfirmDialog(null,"ALUNO CADASTRADO NO CURSO COM SUCESSO!",null,JOptionPane.DEFAULT_OPTION);          
        return result;
    }
}
