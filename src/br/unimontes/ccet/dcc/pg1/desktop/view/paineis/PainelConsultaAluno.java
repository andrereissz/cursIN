package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import br.unimontes.ccet.dcc.pg1.desktop.controller.AtualizarAlunoController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.ConsultarAlunosController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.ConsultarTodosAlunosController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.RemoverAlunoController;
import br.unimontes.ccet.dcc.pg1.desktop.controller.TabelaConsultaAlunoController;
import br.unimontes.ccet.dcc.pg1.model.entity.Aluno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PainelConsultaAluno extends javax.swing.JPanel {

    public PainelConsultaAluno() {
        initComponents();
        Icon i = btCopiarCpf.getIcon();
        ImageIcon icon = (ImageIcon)i;
        Image image = icon.getImage().getScaledInstance(btCopiarCpf.getWidth(), btCopiarCpf.getHeight(), Image.SCALE_SMOOTH);
        btCopiarCpf.setIcon(new ImageIcon(image));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelConsultaAluno = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        header = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer();
        cabeçalho = new javax.swing.JLabel();
        tfCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField();
        tfNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField();
        labelCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        labelNome = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        btBuscar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btRemover = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        btAlterar = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton();
        label1 = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label();
        tfAnoNascimento = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.AnoNascimentoTextField();
        btCopiarCpf = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.ButtonCopiarCpf();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table();

        setBackground(new java.awt.Color(255, 255, 255));

        painelConsultaAluno.setBackground(new java.awt.Color(204, 204, 204));
        painelConsultaAluno.setPreferredSize(new java.awt.Dimension(600, 600));
        painelConsultaAluno.setRaio(20);

        header.setBackground(new java.awt.Color(82, 82, 140));
        header.setRaio(30);

        cabeçalho.setBackground(new java.awt.Color(82, 82, 149));
        cabeçalho.setFont(new java.awt.Font("Moonglade DEMO", 1, 36)); // NOI18N
        cabeçalho.setForeground(new java.awt.Color(255, 204, 255));
        cabeçalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cabeçalho.setText("CONSULTAR ALUNO");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeçalho, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addContainerGap())
        );

        tfCpf.setName("tfCpf"); // NOI18N
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfCpfKeyReleased(evt);
            }
        });

        tfNome.setForeground(new java.awt.Color(0, 0, 0));
        tfNome.setName("tfNome"); // NOI18N
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNomeKeyReleased(evt);
            }
        });

        labelCpf.setForeground(new java.awt.Color(102, 0, 102));
        labelCpf.setText("CPF");
        labelCpf.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        labelNome.setForeground(new java.awt.Color(102, 0, 102));
        labelNome.setText("Nome");
        labelNome.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        btBuscar.setText("CONSULTAR");
        btBuscar.setEnabled(false);
        btBuscar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
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

        btAlterar.setText("ALTERAR");
        btAlterar.setEnabled(false);
        btAlterar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(102, 0, 102));
        label1.setText("Data de Nascimento");
        label1.setFont(new java.awt.Font("Trench", 1, 18)); // NOI18N

        tfAnoNascimento.setEnabled(false);
        tfAnoNascimento.setName("tfAnoNascimento"); // NOI18N

        btCopiarCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unimontes/ccet/dcc/pg1/desktop/view/util/icons/copyicon.jpg"))); // NOI18N
        btCopiarCpf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCopiarCpf.setMinimumSize(new java.awt.Dimension(32, 32));
        btCopiarCpf.setPreferredSize(new java.awt.Dimension(32, 32));
        btCopiarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopiarCpfActionPerformed(evt);
            }
        });

        jScrollPane1.setMaximumSize(new java.awt.Dimension(576, 213));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(576, 213));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(576, 213));

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
        tabelaConsulta.setPreferredSize(new java.awt.Dimension(576, 0));
        tabelaConsulta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaConsulta);

        javax.swing.GroupLayout painelConsultaAlunoLayout = new javax.swing.GroupLayout(painelConsultaAluno);
        painelConsultaAluno.setLayout(painelConsultaAlunoLayout);
        painelConsultaAlunoLayout.setHorizontalGroup(
            painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelConsultaAlunoLayout.createSequentialGroup()
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCopiarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(painelConsultaAlunoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaAlunoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelConsultaAlunoLayout.setVerticalGroup(
            painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConsultaAlunoLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(labelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConsultaAlunoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelConsultaAlunoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btCopiarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelConsultaAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAnoNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelConsultaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfCpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyReleased
        if (tfCpf.getText().length() == 14) {
            btBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_tfCpfKeyReleased

    private void tfNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyReleased
        if ((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false) && (tfCpf.isEnabled() == true)) {
            btBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_tfNomeKeyReleased

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        btBuscar.setEnabled(false);
        TabelaConsultaAlunoController.executa(painelConsultaAluno);
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        /*if ((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false) && (tfAnoNascimento.getText().length() == 10)) {
            AtualizarAlunoController.executa(painelConsultaAluno);
            DefaultTableModel model = (DefaultTableModel) tabelaConsultaAluno.getModel();
            model.setRowCount(0);
            btCopiarCpf.setEnabled(false);
            tfCpf.setEnabled(true);
            ArrayList<Aluno> alunos = ConsultarTodosAlunosController.executa();
            if (alunos != null) {
                for (Aluno aluno : alunos) {
                    String[] data = {aluno.getCpf(), aluno.getNome(), aluno.getAnoNascimento()};
                    model.addRow(data);
                }
            }
        }*/
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        /*if ((tfNome.getText().isBlank() == false || tfNome.getText().isEmpty() == false) && (tfAnoNascimento.getText().length() == 10)) {
            RemoverAlunoController.executa(painelConsultaAluno);
            DefaultTableModel model = (DefaultTableModel) tabelaConsultaAluno.getModel();
            model.setRowCount(0);
            btCopiarCpf.setEnabled(false);
            tfCpf.setEnabled(true);
            ArrayList<Aluno> alunos = ConsultarTodosAlunosController.executa();
            if (alunos != null) {
                for (Aluno aluno : alunos) {
                    String[] data = {aluno.getCpf(), aluno.getNome(), aluno.getAnoNascimento()};
                    model.addRow(data);
                }
            }
        }
        */
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btCopiarCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopiarCpfActionPerformed
        String cpf = tfCpf.getText();
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection ctrlc = new StringSelection(cpf);
        clip.setContents(ctrlc, ctrlc);
    }//GEN-LAST:event_btCopiarCpfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btAlterar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btBuscar;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.ButtonCopiarCpf btCopiarCpf;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons.RoundButton btRemover;
    private javax.swing.JLabel cabeçalho;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer header;
    private javax.swing.JScrollPane jScrollPane1;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label label1;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelCpf;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Label labelNome;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.RoundContainer painelConsultaAluno;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Table tabelaConsulta;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.AnoNascimentoTextField tfAnoNascimento;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.CpfTextField tfCpf;
    private br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields.NomeTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
