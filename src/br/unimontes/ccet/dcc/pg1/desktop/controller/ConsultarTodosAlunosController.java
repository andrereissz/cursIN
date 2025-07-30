package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultarTodosAlunosController {

    public static ArrayList<Aluno> executa(){
        ArrayList<Aluno> alunos = new ArrayList();
        try{
            AlunoDao adao = new AlunoDao();
            alunos = (ArrayList)adao.findAll();
            if(alunos.isEmpty()){
                JOptionPane.showMessageDialog(null,"NENHUM ALUNO REGISTRADO!",null,JOptionPane.ERROR_MESSAGE);            
                return null;
            }
        }
        catch(DAOException | SQLException ex){}
        return alunos;
    }
}
