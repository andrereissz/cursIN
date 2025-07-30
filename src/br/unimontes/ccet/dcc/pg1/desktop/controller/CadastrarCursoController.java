package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CadastrarCursoController {
    public static int executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        int result = 0;
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");
        TextFieldInterface tfCred = (TextFieldInterface) mapa.get("tfCred");
        
        try{
            Curso curso = new Curso(tfNome.getText(),Integer.valueOf(tfCred.getText()));
            CursoDao cdao = new CursoDao();
            result = cdao.save(curso);
            if(result == 2){
                tfNome.setText("");
                tfCred.setText("");
                JOptionPane.showMessageDialog(null,"CURSO JÁ CADASTRADO!",null,JOptionPane.ERROR_MESSAGE);            
                return 1;
            }
        }
        catch(DAOException | SQLException ex){}
        tfNome.setText("");
        tfCred.setText("");
        JOptionPane.showConfirmDialog(null,"CURSO CADASTRADO!",null,JOptionPane.DEFAULT_OPTION);            
        return result;
    }
}
