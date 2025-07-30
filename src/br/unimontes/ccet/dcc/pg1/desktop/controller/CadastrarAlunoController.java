package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.sql.*;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CadastrarAlunoController {
    public static int executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        int result = 0;
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        TextFieldInterface tfAnoNascimento = (TextFieldInterface) mapa.get("tfAnoNascimento");
        
        try{
            Aluno aluno = new Aluno(tfCpf.getText(), tfNome.getText(),tfAnoNascimento.getText());
            AlunoDao aDao = new AlunoDao();
            result = aDao.save(aluno);
            if(result == 2){
                tfNome.setText("");
                tfCpf.setText("");
                tfAnoNascimento.setText("");
                JOptionPane.showMessageDialog(null,"CPF JÁ CADASTRADO!",null,JOptionPane.ERROR_MESSAGE);            
                return result;
            }
        }
        catch(DAOException | SQLException ex){}
        tfNome.setText("");
        tfCpf.setText("");
        tfAnoNascimento.setText("");
        JOptionPane.showConfirmDialog(null,"ALUNO CADASTRADO!",null,JOptionPane.DEFAULT_OPTION);            
        return result;
    }
}
