package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.AtualizarCursoController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.ConsultarCursosController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.ConsultarTodosCursosController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.RemoverCursoController;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PainelConsultarCurso extends javax.swing.JPanel {

    public PainelConsultarCurso(){
        initComponents();
        /*DefaultTableModel model = (DefaultTableModel) tabelaConsultaCursos.getModel();
        ArrayList<Curso> cursos = ConsultarTodosCursosController.executa();
        if (cursos != null) {
            for (Curso curso : cursos) {
                String[] data = {"" + curso.getId(), curso.getNome(), "" + curso.getCreditos()};
                model.addRow(data);
            }
        }*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConsultarCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        cabeçalho = new javax.swing.JLabel();
        labelCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        tfId = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField();
        labelNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        tfNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField();
        labelCreditos = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        tfCreditos = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField();
        btConsultar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btAlterar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btRemover = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));

        painelConsultarCurso.setBackground(new java.awt.Color(204, 204, 204));
        painelConsultarCurso.setRaio(20);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(20);

        cabeçalho.setBackground(new java.awt.Color(82, 82, 149));
        cabeçalho.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 204, 255));
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("CONSULTAR CURSO");
        cabeçalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelCurso.setBackground(new java.awt.Color(102, 0, 102));
        labelCurso.setForeground(new java.awt.Color(102, 0, 102));
        labelCurso.setText("ID do curso");
        labelCurso.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        tfId.setName("tfId"); // NOI18N
        tfId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfIdKeyReleased(evt);
            }
        });

        labelNome.setBackground(new java.awt.Color(102, 0, 102));
        labelNome.setForeground(new java.awt.Color(102, 0, 102));
        labelNome.setText("Nome");
        labelNome.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        tfNome.setForeground(new java.awt.Color(0, 0, 0));
        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        labelCreditos.setBackground(new java.awt.Color(102, 0, 102));
        labelCreditos.setForeground(new java.awt.Color(102, 0, 102));
        labelCreditos.setText("Créditos");
        labelCreditos.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        tfCreditos.setEnabled(false);
        tfCreditos.setName("tfCreditos"); // NOI18N

        btConsultar.setText("CONSULTAR");
        btConsultar.setEnabled(false);
        btConsultar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btAlterar.setText("ALTERAR");
        btAlterar.setEnabled(false);
        btAlterar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btRemover.setText("REMOVER");
        btRemover.setEnabled(false);
        btRemover.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaConsulta.setName("tabelaConsulta"); // NOI18N
        tabelaConsulta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaConsulta);

        javax.swing.GroupLayout painelConsultarCursoLayout = new javax.swing.GroupLayout(painelConsultarCurso);
        painelConsultarCurso.setLayout(painelConsultarCursoLayout);
        painelConsultarCursoLayout.setHorizontalGroup(
            painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultarCursoLayout.createSequentialGroup()
                .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelConsultarCursoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(588, 588, 588)
                        .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelConsultarCursoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelConsultarCursoLayout.setVerticalGroup(
            painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultarCursoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultarCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        RemoverCursoController.executa(painelConsultarCurso);
        /*DefaultTableModel model = (DefaultTableModel) tabelaConsultaCursos.getModel();
        model.setRowCount(0);
        tfId.setEnabled(true);
        ArrayList<Curso> cursos = ConsultarTodosCursosController.executa();
        if (cursos != null) {
            for (Curso curso : cursos) {
                String[] data = {""+curso.getId(), curso.getNome(), ""+curso.getCreditos()};
                model.addRow(data);
            }
        }*/
    }//GEN-LAST:event_btRemoverActionPerformed

    private void tfIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIdKeyReleased
        if (tfId.getText().length() > 0) {
            btConsultar.setEnabled(true);
        }
    }//GEN-LAST:event_tfIdKeyReleased

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        if ((tfId.getText().length() == 0) && (tfId.isEnabled() == true)) {
            btConsultar.setEnabled(true);
        }
    }//GEN-LAST:event_tfNomeKeyReleased

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        btConsultar.setEnabled(false);
        /*ArrayList<Curso> cursos = ConsultarCursosController.executa(painelConsultarCurso);
        DefaultTableModel model = (DefaultTableModel) tabelaConsultaCursos.getModel();
        model.setRowCount(0);
        if (cursos != null) {
            for (Curso curso : cursos) {
                String[] data = {"" + curso.getId(), curso.getNome(), "" + curso.getCreditos()};
                model.addRow(data);
            }
        }*/
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        /*if ((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false) && (tfCreditos.getText().length() > 0)) {
            AtualizarCursoController.executa(painelConsultarCurso);
            DefaultTableModel model = (DefaultTableModel) tabelaConsultaCursos.getModel();
            model.setRowCount(0);
            tfId.setEnabled(true);
            ArrayList<Curso> cursos = ConsultarTodosCursosController.executa();
            if (cursos != null) {
                for (Curso curso : cursos) {
                    String[] data = {"" + curso.getId(), curso.getNome(), "" + curso.getCreditos()};
                    model.addRow(data);
                }
            }
        }*/
    }//GEN-LAST:event_btAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btAlterar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btConsultar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btRemover;
    private javax.swing.JLabel cabeçalho;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JScrollPane jScrollPane1;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelCreditos;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelNome;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelConsultarCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table tabelaConsulta;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField tfCreditos;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField tfId;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
