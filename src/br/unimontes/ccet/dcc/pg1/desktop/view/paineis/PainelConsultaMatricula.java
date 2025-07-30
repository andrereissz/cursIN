package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.ConsultarMatriculasController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.RemoverMatriculaController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckCpfController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckMatriculasController;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import br.unimontes.ccet.dcc.pg1.model.entity.Curso;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PainelConsultaMatricula extends javax.swing.JPanel {

    public PainelConsultaMatricula() {
        initComponents();
        int att = 0;
        DefaultTableModel model = (DefaultTableModel)tabelaConsulta.getModel();
        model.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConsultaMatricula = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        cabeçalho = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        tfCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField();
        btConsultar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btDesmatricular = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        labelCreditos = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        cont = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        labelAux = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        labelAux2 = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table();

        setBackground(new java.awt.Color(255, 255, 255));

        painelConsultaMatricula.setBackground(new java.awt.Color(204, 204, 204));
        painelConsultaMatricula.setRaio(30);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(30);

        cabeçalho.setBackground(new java.awt.Color(82, 82, 149));
        cabeçalho.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 204, 255));
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("CONSULTAR MATRÍCULAS");
        cabeçalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelCpf.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(102, 0, 102));
        labelCpf.setText("CPF");

        tfCpf.setName("tfCpf"); // NOI18N
        tfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCpfFocusGained(evt);
            }
        });
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCpfKeyReleased(evt);
            }
        });

        btConsultar.setText("CONSULTAR");
        btConsultar.setEnabled(false);
        btConsultar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btDesmatricular.setText("DESMATRICULAR");
        btDesmatricular.setEnabled(false);
        btDesmatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesmatricularActionPerformed(evt);
            }
        });

        labelCreditos.setForeground(new java.awt.Color(102, 0, 102));
        labelCreditos.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCreditos.setName("labelCreditos"); // NOI18N

        cont.setForeground(new java.awt.Color(255, 0, 0));
        cont.setName("cont"); // NOI18N

        labelAux.setForeground(new java.awt.Color(204, 204, 204));
        labelAux.setText("sas");
        labelAux.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        labelAux.setName("labelAux"); // NOI18N

        labelAux2.setForeground(new java.awt.Color(204, 204, 204));
        labelAux2.setText("sas2");
        labelAux2.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        labelAux2.setName("labelAux2"); // NOI18N

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

        javax.swing.GroupLayout painelConsultaMatriculaLayout = new javax.swing.GroupLayout(painelConsultaMatricula);
        painelConsultaMatricula.setLayout(painelConsultaMatriculaLayout);
        painelConsultaMatriculaLayout.setHorizontalGroup(
            painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelAux, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDesmatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                        .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCpf)
                                    .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelConsultaMatriculaLayout.setVerticalGroup(
            painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaMatriculaLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelConsultaMatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDesmatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cont, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelAux2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultaMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultaMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyReleased
        if(tfCpf.getText().length() == 14){
            btConsultar.setEnabled(true);
        }
    }//GEN-LAST:event_tfCpfKeyReleased

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        btConsultar.setEnabled(false);
        labelCreditos.setText("");
        cont.setText("");
    }//GEN-LAST:event_btConsultarActionPerformed

    private void tfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCpfFocusGained
        btDesmatricular.setEnabled(false);
        tfCpf.setText("");
        labelCreditos.setText("");
        cont.setText("");
        DefaultTableModel model = (DefaultTableModel)tabelaConsulta.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_tfCpfFocusGained

    private void btDesmatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesmatricularActionPerformed
        btDesmatricular.setEnabled(false);
        DefaultTableModel model = (DefaultTableModel)tabelaConsulta.getModel();
        model.removeRow(tabelaConsulta.getSelectedRow());
        RemoverMatriculaController.executa(painelConsultaMatricula);
    }//GEN-LAST:event_btDesmatricularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btConsultar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btDesmatricular;
    private javax.swing.JLabel cabeçalho;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label cont;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JScrollPane jScrollPane1;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelAux;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelAux2;
    private javax.swing.JLabel labelCpf;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelCreditos;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelConsultaMatricula;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table tabelaConsulta;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField tfCpf;
    // End of variables declaration//GEN-END:variables
}
