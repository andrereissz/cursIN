package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.CadastrarAlunoController;

public class PainelCadastrarAluno extends javax.swing.JPanel {
    public PainelCadastrarAluno() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadAluno = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        jLabel1 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        tfNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField();
        labelCPF = new javax.swing.JLabel();
        tfCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField();
        labelDataNascimento = new javax.swing.JLabel();
        tfAnoNascimento = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.AnoNascimentoTextField();
        btCadastrar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();

        setBackground(new java.awt.Color(255, 255, 255));

        painelCadAluno.setBackground(new java.awt.Color(204, 204, 204));
        painelCadAluno.setRaio(30);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(30);

        jLabel1.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR ALUNO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelNome.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(102, 0, 102));
        labelNome.setText("Nome");

        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        labelCPF.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(102, 0, 102));
        labelCPF.setText("CPF");

        tfCpf.setName("tfCpf"); // NOI18N
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCpfKeyReleased(evt);
            }
        });

        labelDataNascimento.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelDataNascimento.setForeground(new java.awt.Color(102, 0, 102));
        labelDataNascimento.setText("DATA DE NASCIMENTO");

        tfAnoNascimento.setName("tfAnoNascimento"); // NOI18N
        tfAnoNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAnoNascimentoKeyReleased(evt);
            }
        });

        btCadastrar.setText("CADASTRAR");
        btCadastrar.setEnabled(false);
        btCadastrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelCadAlunoLayout = new javax.swing.GroupLayout(painelCadAluno);
        painelCadAluno.setLayout(painelCadAlunoLayout);
        painelCadAlunoLayout.setHorizontalGroup(
            painelCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelCadAlunoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painelCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDataNascimento)
                    .addComponent(labelCPF)
                    .addComponent(labelNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfAnoNascimento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        painelCadAlunoLayout.setVerticalGroup(
            painelCadAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadAlunoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelDataNascimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 97, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        if((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)
                &&(tfCpf.getText().isBlank() == false || tfCpf.getText().isEmpty() == false &&(tfCpf.getText().length() == 14))
                &&(tfAnoNascimento.getText().isBlank() == false || tfAnoNascimento.getText().isEmpty() == false &&(tfAnoNascimento.getText().length() == 10))){
            btCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyReleased
        if((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)
                &&(tfCpf.getText().isBlank() == false || tfCpf.getText().isEmpty() == false &&(tfCpf.getText().length() == 14))
                &&(tfAnoNascimento.getText().isBlank() == false || tfAnoNascimento.getText().isEmpty() == false &&(tfAnoNascimento.getText().length() == 10))){
            btCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_tfCpfKeyReleased

    private void tfAnoNascimentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnoNascimentoKeyReleased
        if((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)
                &&(tfCpf.getText().isBlank() == false || tfCpf.getText().isEmpty() == false &&(tfCpf.getText().length() == 14))
                &&(tfAnoNascimento.getText().isBlank() == false || tfAnoNascimento.getText().isEmpty() == false &&(tfAnoNascimento.getText().length() == 10))){
            btCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_tfAnoNascimentoKeyReleased

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        btCadastrar.setEnabled(false);
        CadastrarAlunoController.executa(painelCadAluno);
    }//GEN-LAST:event_btCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCadastrar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelDataNascimento;
    private javax.swing.JLabel labelNome;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelCadAluno;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.AnoNascimentoTextField tfAnoNascimento;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField tfCpf;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
