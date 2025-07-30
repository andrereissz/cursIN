package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckAlunosController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckCursosController;

public class PainelMenuAluno extends javax.swing.JPanel {

    public PainelMenuAluno() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenuAluno = new br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel();
        btCadAluno = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btCadMatricula = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btConsultaMatricula = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btConsultaAluno = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));

        painelMenuAluno.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuAluno.setForeground(new java.awt.Color(255, 255, 255));
        painelMenuAluno.setPreferredSize(new java.awt.Dimension(600, 600));

        btCadAluno.setText("CADASTRAR ALUNO");
        btCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadAlunoActionPerformed(evt);
            }
        });

        btCadMatricula.setText("MATRICULAR EM CURSO");
        btCadMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadMatriculaActionPerformed(evt);
            }
        });

        btConsultaMatricula.setText("CONSULTAR MATRÍCULAS");
        btConsultaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaMatriculaActionPerformed(evt);
            }
        });

        btConsultaAluno.setText("CONSULTAR ALUNO");
        btConsultaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuAlunoLayout = new javax.swing.GroupLayout(painelMenuAluno);
        painelMenuAluno.setLayout(painelMenuAlunoLayout);
        painelMenuAlunoLayout.setHorizontalGroup(
            painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuAlunoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCadAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btConsultaMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btConsultaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        painelMenuAlunoLayout.setVerticalGroup(
            painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuAlunoLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btCadAluno, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btConsultaAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(painelMenuAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadAlunoActionPerformed
        painelMenuAluno.removeAll();
        painelMenuAluno.repaint();
        painelMenuAluno.revalidate();

        PainelCadastrarAluno pcadaluno = new PainelCadastrarAluno();
        pcadaluno.setSize(painelMenuAluno.getWidth(), painelMenuAluno.getHeight());
        painelMenuAluno.add(pcadaluno);
        painelMenuAluno.repaint();
        painelMenuAluno.revalidate();
    }//GEN-LAST:event_btCadAlunoActionPerformed

    private void btCadMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadMatriculaActionPerformed
        if (CheckAlunosController.executa() == true && CheckCursosController.executa() == true) {
            painelMenuAluno.removeAll();
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();

            PainelCadastrarMatricula pcadalunocurso = new PainelCadastrarMatricula();
            pcadalunocurso.setSize(painelMenuAluno.getWidth(), painelMenuAluno.getHeight());
            painelMenuAluno.add(pcadalunocurso);
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();
        }
    }//GEN-LAST:event_btCadMatriculaActionPerformed

    private void btConsultaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaMatriculaActionPerformed
        if (CheckAlunosController.executa() == true) {
            painelMenuAluno.removeAll();
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();

            PainelConsultaMatricula pcm = new PainelConsultaMatricula();
            pcm.setSize(painelMenuAluno.getWidth(), painelMenuAluno.getHeight());
            painelMenuAluno.add(pcm);
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();
        }

    }//GEN-LAST:event_btConsultaMatriculaActionPerformed

    private void btConsultaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultaAlunoActionPerformed
        if(CheckAlunosController.executa() == true){
            painelMenuAluno.removeAll();
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();

            PainelConsultaAluno pca = new PainelConsultaAluno();
            pca.setSize(painelMenuAluno.getWidth(), painelMenuAluno.getHeight());
            painelMenuAluno.add(pca);
            painelMenuAluno.repaint();
            painelMenuAluno.revalidate();
        }
    }//GEN-LAST:event_btConsultaAlunoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCadAluno;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCadMatricula;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btConsultaAluno;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btConsultaMatricula;
    private br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel painelMenuAluno;
    // End of variables declaration//GEN-END:variables
}
