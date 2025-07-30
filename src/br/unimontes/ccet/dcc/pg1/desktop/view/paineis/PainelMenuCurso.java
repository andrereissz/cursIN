package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.CheckCursosController;

public class PainelMenuCurso extends javax.swing.JPanel {

    public PainelMenuCurso() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelMenuCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel();
        btCadCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btDelCurso = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        roundButton1 = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(600, 600));

        painelMenuCurso.setBackground(new java.awt.Color(255, 255, 255));
        painelMenuCurso.setForeground(new java.awt.Color(255, 255, 255));
        painelMenuCurso.setPreferredSize(new java.awt.Dimension(600, 600));

        btCadCurso.setText("CADASTRAR CURSO");
        btCadCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadCursoActionPerformed(evt);
            }
        });

        btDelCurso.setText("CONSULTAR CURSO");
        btDelCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelCursoActionPerformed(evt);
            }
        });

        roundButton1.setText("MATRÍCULAS POR CURSO");
        roundButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelMenuCursoLayout = new javax.swing.GroupLayout(painelMenuCurso);
        painelMenuCurso.setLayout(painelMenuCursoLayout);
        painelMenuCursoLayout.setHorizontalGroup(
            painelMenuCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuCursoLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(painelMenuCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btDelCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btCadCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(roundButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        painelMenuCursoLayout.setVerticalGroup(
            painelMenuCursoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMenuCursoLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btCadCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDelCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelMenuCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btCadCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadCursoActionPerformed
        
        painelMenuCurso.removeAll();
        painelMenuCurso.repaint();
        painelMenuCurso.revalidate();
        
        PainelCadastrarCurso pCadCurso = new PainelCadastrarCurso();
        pCadCurso.setSize(painelMenuCurso.getWidth(),painelMenuCurso.getHeight());
        painelMenuCurso.add(pCadCurso);
        painelMenuCurso.repaint();
        painelMenuCurso.revalidate();
    }//GEN-LAST:event_btCadCursoActionPerformed

    private void btDelCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelCursoActionPerformed
        if(CheckCursosController.executa() == true){
            painelMenuCurso.removeAll();
            painelMenuCurso.repaint();
            painelMenuCurso.revalidate();
        
            PainelConsultarCurso pDelCurso = new PainelConsultarCurso();
            pDelCurso.setSize(painelMenuCurso.getWidth(),painelMenuCurso.getHeight());
            painelMenuCurso.add(pDelCurso);
            painelMenuCurso.repaint();
            painelMenuCurso.revalidate();
        }
    }//GEN-LAST:event_btDelCursoActionPerformed

    private void roundButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundButton1ActionPerformed
        if(CheckCursosController.executa() == true){
            painelMenuCurso.removeAll();
            painelMenuCurso.repaint();
            painelMenuCurso.revalidate();
        
            PainelConsultarTurmas pct = new PainelConsultarTurmas();
            pct.setSize(painelMenuCurso.getWidth(),painelMenuCurso.getHeight());
            painelMenuCurso.add(pct);
            painelMenuCurso.repaint();
            painelMenuCurso.revalidate();
        }
    }//GEN-LAST:event_roundButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCadCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btDelCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel painelMenuCurso;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton roundButton1;
    // End of variables declaration//GEN-END:variables
}
