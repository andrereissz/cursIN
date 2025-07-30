package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.view.TelaPrincipal;
import javax.swing.SwingUtilities;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Session;

public class PainelMenu extends javax.swing.JPanel {
    public PainelMenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerMenu = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Container();
        btSair = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btUsuário = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btCursos = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btAlunos = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        labelSessao = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.LabelSession();
        labelApp = new javax.swing.JLabel();
        labelWelcome = new javax.swing.JLabel();
        painelMenu = new br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));

        containerMenu.setBackground(new java.awt.Color(82, 82, 140));

        btSair.setText("SAIR");
        btSair.setName("btSair"); // NOI18N
        btSair.setRaio(0);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btUsuário.setText("USUÁRIO");
        btUsuário.setName("btUsuário"); // NOI18N
        btUsuário.setRaio(0);
        btUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuárioActionPerformed(evt);
            }
        });

        btCursos.setText("CURSOS");
        btCursos.setName("btCursos"); // NOI18N
        btCursos.setRaio(0);
        btCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCursosActionPerformed(evt);
            }
        });

        btAlunos.setText("ALUNOS");
        btAlunos.setName("btAlunos"); // NOI18N
        btAlunos.setRaio(0);
        btAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlunosActionPerformed(evt);
            }
        });

        labelSessao.setForeground(new java.awt.Color(255, 153, 255));
        labelSessao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSessao.setText("<html><p style=\"width 180px\">"+Session.getSessionNome()+"</p></html>");
        labelSessao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelApp.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        labelApp.setForeground(new java.awt.Color(255, 0, 255));
        labelApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApp.setText("cursIN");
        labelApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelWelcome.setBackground(new java.awt.Color(255, 153, 255));
        labelWelcome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelWelcome.setForeground(new java.awt.Color(255, 153, 255));
        labelWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelWelcome.setText("Bem vindo(a) !");
        labelWelcome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout containerMenuLayout = new javax.swing.GroupLayout(containerMenu);
        containerMenu.setLayout(containerMenuLayout);
        containerMenuLayout.setHorizontalGroup(
            containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btUsuário, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(containerMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelApp, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(labelSessao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        containerMenuLayout.setVerticalGroup(
            containerMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerMenuLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(labelApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelWelcome)
                .addGap(0, 0, 0)
                .addComponent(labelSessao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btUsuário, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        painelMenu.setBackground(new java.awt.Color(255, 255, 255));
        painelMenu.setName("painelMenu"); // NOI18N

        javax.swing.GroupLayout painelMenuLayout = new javax.swing.GroupLayout(painelMenu);
        painelMenu.setLayout(painelMenuLayout);
        painelMenuLayout.setHorizontalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        painelMenuLayout.setVerticalGroup(
            painelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(containerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        new TelaPrincipal().setVisible(true);
        SwingUtilities.getWindowAncestor(this).dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlunosActionPerformed
        painelMenu.removeAll();
        painelMenu.repaint();
        painelMenu.revalidate();
        
        PainelMenuAluno pMenuAluno = new PainelMenuAluno();
        pMenuAluno.setSize(painelMenu.getWidth(),painelMenu.getHeight());
        painelMenu.add(pMenuAluno);
        painelMenu.repaint();
        painelMenu.revalidate();
    }//GEN-LAST:event_btAlunosActionPerformed

    private void btCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCursosActionPerformed
        painelMenu.removeAll();
        painelMenu.repaint();
        painelMenu.revalidate();
        
        PainelMenuCurso pMenuCurso = new PainelMenuCurso();
        pMenuCurso.setSize(painelMenu.getWidth(),painelMenu.getHeight());
        painelMenu.add(pMenuCurso);
        painelMenu.repaint();
        painelMenu.revalidate();
    }//GEN-LAST:event_btCursosActionPerformed

    private void btUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuárioActionPerformed
/*        painelMenu.removeAll();
        painelMenu.repaint();
        painelMenu.revalidate();
        
        PainelMatriculasCurso pMenuConsulta = new PainelMatriculasCurso();
        pMenuConsulta.setSize(painelMenu.getWidth(),painelMenu.getHeight());
        painelMenu.add(pMenuConsulta);
        painelMenu.repaint();
        painelMenu.revalidate();*/
    }//GEN-LAST:event_btUsuárioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btAlunos;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btCursos;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btSair;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btUsuário;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Container containerMenu;
    private javax.swing.JLabel labelApp;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.LabelSession labelSessao;
    private javax.swing.JLabel labelWelcome;
    private br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel painelMenu;
    // End of variables declaration//GEN-END:variables
}
