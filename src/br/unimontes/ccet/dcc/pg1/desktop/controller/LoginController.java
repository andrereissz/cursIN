package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PasswordFieldInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Criptografar;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Session;
import br.unimontes.ccet.dcc.pg1.model.dao.UsuarioDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Usuario;
import java.awt.Component;
import java.util.HashMap;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginController {
    public static int executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        
        int result = 0;
        
        TextFieldInterface tfUser = (TextFieldInterface) mapa.get("tfUser");
        PasswordFieldInterface ptfSenha = (PasswordFieldInterface) mapa.get("ptfSenha");
        
        try{
            Usuario usuario = new Usuario(tfUser.getText());
            String aux = new String(ptfSenha.getPassword());
            
            UsuarioDao uDao = new UsuarioDao();
            result = uDao.verificaLogin(usuario, Criptografar.encriptografar(aux));
            switch(result){
                case 1 -> {
                    Session.setSessionUsername(usuario.getUsername());
                    Session.setSessionFoto(usuario.getFoto());
                }
                case 2 -> {
                    tfUser.setText("");
                    ptfSenha.setText("");
                    JOptionPane.showMessageDialog(null,"SENHA INCORRETA!",null,JOptionPane.ERROR_MESSAGE);            
                }
                case 3 -> {
                    tfUser.setText("");
                    ptfSenha.setText("");
                    JOptionPane.showMessageDialog(null,"USUÁRIO INEXISTENTE!",null,JOptionPane.ERROR_MESSAGE);            
                }
            }
        }
        catch(DAOException | SQLException ex){}
        return result;
    }
}