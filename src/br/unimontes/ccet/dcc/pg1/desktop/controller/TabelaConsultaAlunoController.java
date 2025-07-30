package br.unimontes.ccet.dcc.pg1.desktop.controller;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TableInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import br.unimontes.ccet.dcc.pg1.model.dao.AlunoDao;
import br.unimontes.ccet.dcc.pg1.model.dao.exception.DAOException;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TabelaConsultaAlunoController {

    public static void executa(PainelInterface view) {
        HashMap<String, Component> mapa = view.getMapComponentes();
        TableInterface tabelaConsulta = (TableInterface) mapa.get("tabelaConsulta");
        TextFieldInterface tfCpf = (TextFieldInterface) mapa.get("tfCpf");
        TextFieldInterface tfNome = (TextFieldInterface) mapa.get("tfNome");

        ArrayList<Aluno> alunos = new ArrayList();
        DefaultTableModel model = new DefaultTableModel();

        if ((tfCpf.getText().isBlank() == true || tfCpf.getText().isEmpty() == true)
                && (tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)) {
            try {
                AlunoDao adao = new AlunoDao();
                if (adao.buscarNome(tfNome.getText()) == null) {
                    tfNome.setText("");
                    tfCpf.setText("");
                    JOptionPane.showMessageDialog(null, "Não existe aluno com o nome: " + tfNome.getText(), null, JOptionPane.ERROR_MESSAGE);
                }
                alunos = (ArrayList) adao.buscarNome(tfNome.getText());
                model.addColumn("CPF");
                model.addColumn("Nome");
                model.addColumn("Ano Nascimento");
                for (Aluno aluno : alunos) {
                    model.addRow(new Object[]{aluno.getCpf(), aluno.getNome(), aluno.getAnoNascimento()});
                }
                System.out.println(alunos);
                tabelaConsulta.setModel(model);
            } catch (SQLException | DAOException ex) {
                System.out.println(ex);
            }
        }
        if ((tfCpf.getText().isBlank() == false || tfCpf.getText().isEmpty() == false)) {
            try {
                AlunoDao adao = new AlunoDao();
                if (adao.buscarCpf(tfCpf.getText()) == null) {
                    tfNome.setText("");
                    tfCpf.setText("");
                    JOptionPane.showMessageDialog(null, "Não existe aluno com o cpf: " + tfCpf.getText(), null, JOptionPane.ERROR_MESSAGE);
                }
                alunos = (ArrayList) adao.buscarCpf(tfCpf.getText());
                model.addColumn("CPF");
                model.addColumn("Nome");
                model.addColumn("Ano Nascimento");
                for (Aluno aluno : alunos) {
                    model.addRow(new Object[]{aluno.getCpf(), aluno.getNome(), aluno.getAnoNascimento()});
                }
                System.out.println(alunos);
                tabelaConsulta.setModel(model);
            } catch (SQLException | DAOException ex) {
                System.out.println(ex);
            }
        }
    }

}
