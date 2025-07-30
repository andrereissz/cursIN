package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import java.sql.SQLException;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.awt.Component;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class AtualizarAlunoController {
    public static void executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");
        TextFieldInterface tfAnoNascimento = (TextFieldInterface) mapa.get("tfAnoNascimento");
        
        try{
            AlunoDao adao = new AlunoDao();
            if(adao.update(new Aluno(tfCpf.getText(),tfNome.getText(),tfAnoNascimento.getText())) == 1){
                tfCpf.setText("");
                tfNome.setText("");
                tfAnoNascimento.setText("");
                JOptionPane.showMessageDialog(null,"Aluno atualizado com sucesso!",null,JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(DAOException | SQLException ex){System.out.println(ex);}
    }
}
