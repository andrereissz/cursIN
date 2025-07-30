package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class RemoverCursoController {

    public static void executa(PainelInterface view) {
        HashMap<String, Component> mapa = view.getMapComponentes();
        TextFieldInterface tfId = (TextFieldInterface)mapa.get("tfId");
        TextFieldInterface tfNome = (TextFieldInterface)mapa.get("tfNome");
        TextFieldInterface tfCreditos = (TextFieldInterface)mapa.get("tfCreditos");
        
        try{
            CursoDao cdao = new CursoDao();
            cdao.delete(new Curso(Integer.valueOf(tfId.getText())));
            try{
                AlunoCursoDao alucudao = new AlunoCursoDao();
                alucudao.desmatricularTodosAlunos(Integer.valueOf(tfId.getText()));
            }
            catch(DAOException | SQLException ex){System.out.println(ex);}
        }
        catch(DAOException | SQLException ex){System.out.println(ex);} 
        tfId.setText("");
        tfNome.setText("");
        tfCreditos.setText("");
        JOptionPane.showMessageDialog(null, "Curso "+tfNome.getText()+"\nREMOVIDO juntamente de todas suas matrículas.");
    }
}
