package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PasswordFieldInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Criptografar;
import br.unimontes.ccet.dcc.pg1.model.dao.UsuarioDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Usuario;
import java.awt.Component;
import java.util.HashMap;
import java.sql.*;
import javax.swing.JOptionPane;

public class CadastrarUsuarioController {
    public static int executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        
        TextFieldInterface tfUser = (TextFieldInterface) mapa.get("tfUser");
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");
        PasswordFieldInterface ptfSenha = (PasswordFieldInterface) mapa.get("ptfSenha");
        try{
            Usuario usuario = new Usuario(tfUser.getText());
            usuario.setNome(tfNome.getText());
            usuario.setFoto(null);
            
            //criptografa a senha senha
            String aux = new String(ptfSenha.getPassword());
            usuario.setSenha(Criptografar.encriptografar(aux));
            
            UsuarioDao uDao = new UsuarioDao();
            if(uDao.verificaUser(usuario) == false){
                uDao.save(usuario);
                JOptionPane.showMessageDialog(null,"USUÁRIO CADASTRADO COM SUCESSO!",null,JOptionPane.INFORMATION_MESSAGE);
                return 1;
            }
            
        }
        catch(DAOException | SQLException ex){}
        tfNome.setText("");
        tfUser.setText("");
        ptfSenha.setText("");
        JOptionPane.showMessageDialog(null,"USERNAME JÁ CADASTRADO!",null,JOptionPane.ERROR_MESSAGE);            
        return 0;
    }
}
