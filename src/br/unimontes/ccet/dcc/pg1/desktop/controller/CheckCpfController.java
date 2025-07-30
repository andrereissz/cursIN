package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CheckCpfController {
    
    public static boolean executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        try {
            AlunoDao adao = new AlunoDao();
            if(adao.verificarCpf(tfCpf.getText()) == true){
                return true;
            }
        } catch (DAOException | SQLException ex) {}
        tfCpf.setText("");
        JOptionPane.showMessageDialog(null,"ALUNO INEXISTENTE!",null,JOptionPane.ERROR_MESSAGE);  
        return false;
    }
}
