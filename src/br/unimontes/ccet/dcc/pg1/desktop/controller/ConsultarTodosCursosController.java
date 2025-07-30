package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConsultarTodosCursosController {

    public static ArrayList<Curso> executa(){
        ArrayList<Curso> cursos = new ArrayList();
        try{
            CursoDao cdao = new CursoDao();
            cursos = (ArrayList)cdao.findAll();
            if(cursos.isEmpty()){
                JOptionPane.showMessageDialog(null,"NENHUM CURSO REGISTRADO!",null,JOptionPane.ERROR_MESSAGE);            
                return null;
            }
        }
        catch(DAOException | SQLException ex){}
        return cursos;
    }
}
