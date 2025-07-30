package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ComboBoxInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.CursoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class ComboBoxCursosController {

    public static void executa(PainelInterface view) {
        HashMap<String, Component> mapa = view.getMapComponentes();
        ComboBoxInterface selectCurso = (ComboBoxInterface) mapa.get("selectCurso");

        ArrayList<Curso> cursos = new ArrayList();

        try {
            CursoDao cdao = new CursoDao();
            cursos = (ArrayList) cdao.findAll();
        } catch (DAOException | SQLException ex) {}
        
        for (Curso curso : cursos) {
            selectCurso.addItem(curso.getNome());
        }
        selectCurso.removeItemAt(0);
        
    }
}
