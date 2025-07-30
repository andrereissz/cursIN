package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CheckCursosController {
    public static boolean executa(){
        try {
            CursoDao cdao = new CursoDao();
            ArrayList<Curso> cursos = (ArrayList)cdao.findAll();
            if(cursos.isEmpty()){
                JOptionPane.showMessageDialog(null,"NENHUM CURSO CADASTRADO!",null,JOptionPane.ERROR_MESSAGE);  
                return false;
            }
        } catch (DAOException | SQLException ex) {};
        return true;
    }
}
