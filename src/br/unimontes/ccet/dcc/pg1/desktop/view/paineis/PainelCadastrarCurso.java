package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.CadastrarCursoController;
public class PainelCadastrarCurso extends javax.swing.JPanel {
    public PainelCadastrarCurso() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelCadCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        cabeçalho = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        tfNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField();
        labelCreditos = new javax.swing.JLabel();
        tfCred = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField();
        btCadastrar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();

        setBackground(new java.awt.Color(255, 255, 255));

        painelCadCurso.setBackground(new java.awt.Color(204, 204, 204));
        painelCadCurso.setRaio(30);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(30);

        cabeçalho.setBackground(new java.awt.Color(82, 82, 149));
        cabeçalho.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 204, 255));
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("CADASTRAR CURSO");
        cabeçalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
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

        labelNome.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(102, 0, 102));
        labelNome.setText("Nome");

        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        labelCreditos.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N
        labelCreditos.setForeground(new java.awt.Color(102, 0, 102));
        labelCreditos.setText("Créditos");

        tfCred.setName("tfCred"); // NOI18N
        tfCred.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCredKeyReleased(evt);
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

        javax.swing.GroupLayout painelCadCursoLayout = new javax.swing.GroupLayout(painelCadCurso);
        painelCadCurso.setLayout(painelCadCursoLayout);
        painelCadCursoLayout.setHorizontalGroup(
            painelCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(painelCadCursoLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(painelCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfCred, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelCreditos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCadCursoLayout.setVerticalGroup(
            painelCadCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadCursoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(labelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCreditos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        if((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)&&(tfCred.getText().isBlank() == false || tfCred.getText().isEmpty() == false)){
            btCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_tfNomeKeyReleased

    private void tfCredKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCredKeyReleased
        if((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false)&&(tfCred.getText().isBlank() == false || tfCred.getText().isEmpty() == false)){
            btCadastrar.setEnabled(true);
        }
    }//GEN-LAST:event_tfCredKeyReleased

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        btCadastrar.setEnabled(false);
        CadastrarCursoController.executa(painelCadCurso);
    }//GEN-LAST:event_btCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCadastrar;
    private javax.swing.JLabel cabeçalho;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JLabel labelCreditos;
    private javax.swing.JLabel labelNome;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelCadCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NumTextField tfCred;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
