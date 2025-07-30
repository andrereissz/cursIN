package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.LabelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoCursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.AlunoCurso;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ConsultarMatriculasController {
    public static ArrayList<Curso> executa(PainelInterface view){
        HashMap<String, Component> mapa = view.getMapComponentes();
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        LabelInterface cont = (LabelInterface) mapa.get("cont");
        LabelInterface labelCreditos = (LabelInterface) mapa.get("labelCreditos");
        
        ArrayList<Curso> cursos = new ArrayList();
        
        try{
            AlunoCurso alunocurso = new AlunoCurso(tfCpf.getText());
            AlunoCursoDao acdao = new AlunoCursoDao();
            cursos = acdao.buscaCursosMatriculados(alunocurso);
        }
        catch(DAOException | SQLException ex){System.out.println(ex);}
        
        Integer valortotal = 0;
        labelCreditos.setText("TOTAL CRÉDITOS:");
        for(Curso curso: cursos){
            valortotal += curso.getCreditos();
        }
        cont.setText(valortotal.toString());
        return cursos;
    }
}