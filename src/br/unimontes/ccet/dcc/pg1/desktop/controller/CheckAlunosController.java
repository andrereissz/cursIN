package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CheckAlunosController {
    public static boolean executa(){
        try {
            AlunoDao adao = new AlunoDao();
            if(adao.findAll().isEmpty()){
                JOptionPane.showMessageDialog(null,"NENHUM ALUNO CADASTRADO!",null,JOptionPane.ERROR_MESSAGE);  
                return false;
            }
        } catch (DAOException | SQLException ex) {};
        return true;
    }
}
