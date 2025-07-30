package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.CadastrarMatriculaController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckCpfController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.ComboBoxCursosController;

public class PainelCadastrarMatricula extends javax.swing.JPanel {

    public PainelCadastrarMatricula() {
        initComponents();
        ComboBoxCursosController.executa(painelCadAlunoCurso);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadAlunoCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        cabeçalho = new javax.swing.JLabel();
        tfCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField();
        labelCpf = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();
        selectCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.ComboBoxCursos();
        btMatricular = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();

        setBackground(new java.awt.Color(255, 255, 255));

        painelCadAlunoCurso.setBackground(new java.awt.Color(204, 204, 204));
        painelCadAlunoCurso.setRaio(30);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(30);

        cabeçalho.setBackground(new java.awt.Color(82, 82, 149));
        cabeçalho.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 204, 255));
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("MATRICULAR EM CURSO");
        cabeçalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        tfCpf.setName("tfCpf"); // NOI18N
        tfCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCpfFocusGained(evt);
            }
        });

        labelCpf.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCpf.setForeground(new java.awt.Color(102, 0, 102));
        labelCpf.setText("CPF");

        labelCurso.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCurso.setForeground(new java.awt.Color(102, 0, 102));
        labelCurso.setText("Selecione o curso");

        selectCurso.setName("selectCurso"); // NOI18N
        selectCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectCursoMouseEntered(evt);
            }
        });

        btMatricular.setText("MATRICULAR");
        btMatricular.setEnabled(false);
        btMatricular.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btMatricular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMatricularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadAlunoCursoLayout = new javax.swing.GroupLayout(painelCadAlunoCurso);
        painelCadAlunoCurso.setLayout(painelCadAlunoCursoLayout);
        painelCadAlunoCursoLayout.setHorizontalGroup(
            painelCadAlunoCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelCadAlunoCursoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painelCadAlunoCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadAlunoCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelCurso)
                        .addComponent(labelCpf)
                        .addComponent(tfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selectCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadAlunoCursoLayout.setVerticalGroup(
            painelCadAlunoCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadAlunoCursoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btMatricular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadAlunoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadAlunoCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectCursoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCursoMouseEntered
        if ((tfCpf.getText().length() == 14) && (selectCurso.getSelectedItem().toString().isBlank() == false || selectCurso.getSelectedItem().toString().isBlank() == false)) {
            btMatricular.setEnabled(true);
        } else {
            btMatricular.setEnabled(false);
        }
    }//GEN-LAST:event_selectCursoMouseEntered

    private void btMatricularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMatricularActionPerformed
        btMatricular.setEnabled(false);
        if(CheckCpfController.executa(painelCadAlunoCurso) == true){
            CadastrarMatriculaController.executa(painelCadAlunoCurso);
        } 
    }//GEN-LAST:event_btMatricularActionPerformed

    private void tfCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCpfFocusGained
        tfCpf.setText("");
    }//GEN-LAST:event_tfCpfFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btMatricular;
    private javax.swing.JLabel cabeçalho;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelCadAlunoCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.ComboBoxCursos selectCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField tfCpf;
    // End of variables declaration//GEN-END:variables
}
