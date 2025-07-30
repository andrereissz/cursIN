package br.unimontes.ccet.dcc.pg1.desktop.view;

import br.unimontes.ccet.dcc.pg1.desktop.view.paineis.PainelMenu;
import br.unimontes.ccet.dcc.pg1.desktop.controller.LoginController;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
        Icon i = iconSair.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(iconSair.getWidth(), iconSair.getHeight(), Image.SCALE_SMOOTH);
        iconSair.setIcon(new ImageIcon(image));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel();
        painelLogin = new br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel();
        pLogin = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        tfUser = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.UserTextField();
        ptfSenha = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.PasswordField();
        btLogin = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        labelApp = new javax.swing.JLabel();
        labelCadastrar = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        iconSair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("TelaPrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        painelPrincipal.setName("painelPrincipal"); // NOI18N
        painelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));

        painelLogin.setBackground(new java.awt.Color(82, 82, 140));
        painelLogin.setName("painelLogin"); // NOI18N

        pLogin.setBackground(new java.awt.Color(204, 204, 204));
        pLogin.setName("pLogin"); // NOI18N
        pLogin.setPreferredSize(new java.awt.Dimension(240, 300));
        pLogin.setRaio(25);

        tfUser.setBackground(new java.awt.Color(255, 255, 255));
        tfUser.setName("tfUser"); // NOI18N
        tfUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfUserKeyReleased(evt);
            }
        });

        ptfSenha.setBackground(new java.awt.Color(255, 255, 255));
        ptfSenha.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ptfSenha.setName("ptfSenha"); // NOI18N
        ptfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ptfSenhaKeyReleased(evt);
            }
        });

        btLogin.setText("LOGIN");
        btLogin.setEnabled(false);
        btLogin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btLogin.setName("btLogin"); // NOI18N
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        labelApp.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        labelApp.setForeground(new java.awt.Color(102, 0, 102));
        labelApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApp.setText("cursIN");
        labelApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labelCadastrar.setFont(new java.awt.Font("Moonglade DEMO", 0, 12)); // NOI18N
        labelCadastrar.setForeground(new java.awt.Color(102, 102, 102));
        labelCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCadastrar.setText("cadastre-se aqui");
        labelCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        labelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelCadastrarMouseClicked(evt);
            }
        });

        labelUser.setFont(new java.awt.Font("Trench", 1, 14)); // NOI18N
        labelUser.setForeground(new java.awt.Color(102, 0, 102));
        labelUser.setText("Usuário");

        labelSenha.setFont(new java.awt.Font("Trench", 1, 14)); // NOI18N
        labelSenha.setForeground(new java.awt.Color(102, 0, 102));
        labelSenha.setText("Senha");

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(labelUser)
                            .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ptfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelApp, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(tfUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelSenha))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(labelApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(labelSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ptfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCadastrar)
                .addContainerGap())
        );

        iconSair.setBackground(new java.awt.Color(0, 0, 0));
        iconSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unimontes/ccet/dcc/pg1/desktop/view/util/icons/sair.png"))); // NOI18N
        iconSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconSair.setPreferredSize(new java.awt.Dimension(50, 50));
        iconSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(280, 280, 280))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(pLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(iconSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        btLogin.setEnabled(false);
        if(LoginController.executa(pLogin) == 1){
            painelPrincipal.removeAll();
            painelPrincipal.repaint();
            painelPrincipal.revalidate();
            PainelMenu pmenu = new PainelMenu();
            pmenu.setSize(painelPrincipal.getWidth(),painelPrincipal.getHeight());
            painelPrincipal.add(pmenu);
            painelPrincipal.repaint();
            painelPrincipal.revalidate();
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void labelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelCadastrarMouseClicked
        new TelaCadastro().setVisible(true);
        dispose();
    }//GEN-LAST:event_labelCadastrarMouseClicked

    private void iconSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSairMouseClicked
        dispose();
    }//GEN-LAST:event_iconSairMouseClicked

    private void tfUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUserKeyReleased
        if((tfUser.getText().isBlank() == false || tfUser.getText().isEmpty() == false || tfUser.getText().compareTo("Invalido") != 0)&&
            (ptfSenha.getText().isBlank() == false || ptfSenha.getText().isEmpty() == false)){
            btLogin.setEnabled(true);
        }
    }//GEN-LAST:event_tfUserKeyReleased

    private void ptfSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptfSenhaKeyReleased
        if((tfUser.getText().isBlank() == false || tfUser.getText().isEmpty() == false || tfUser.getText().compareTo("Invalido") != 0)&&
            (ptfSenha.getText().isBlank() == false || ptfSenha.getText().isEmpty() == false)){
            btLogin.setEnabled(true);
        }
    }//GEN-LAST:event_ptfSenhaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btLogin;
    private javax.swing.JLabel iconSair;
    private javax.swing.JLabel labelApp;
    private javax.swing.JLabel labelCadastrar;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUser;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer pLogin;
    private br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel painelLogin;
    private br.unimontes.ccet.dcc.pg1.desktop.view.paineis.Painel painelPrincipal;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.PasswordField ptfSenha;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.UserTextField tfUser;
    // End of variables declaration//GEN-END:variables
}
