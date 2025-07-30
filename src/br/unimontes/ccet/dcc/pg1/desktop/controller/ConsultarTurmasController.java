package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ComboBoxInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import java.sql.SQLException;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class ConsultarTurmasController {
    public static ArrayList<String[]> executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        ComboBoxInterface selectCursos = (ComboBoxInterface) mapa.get("selectCurso");
        ArrayList<String[]> linhas = new ArrayList();
        
        try{
            AlunoCursoDao acdao = new AlunoCursoDao();
            linhas = (ArrayList) acdao.consultarTodasMatriculas(selectCursos.getSelectedItem().toString());
            if(linhas.isEmpty() == false){
                return linhas;
            }
        }
        catch(SQLException | DAOException ex){System.out.println(ex);}
     
        JOptionPane.showMessageDialog(null, "O curso "+selectCursos.getSelectedItem().toString()+" não possui alunos matriculados",null,JOptionPane.WARNING_MESSAGE);
        return null;
    }
}
