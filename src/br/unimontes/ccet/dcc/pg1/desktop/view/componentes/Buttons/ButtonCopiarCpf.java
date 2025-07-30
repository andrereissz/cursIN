package br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons;

import javax.swing.JButton;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ButtonInterface;
import java.awt.Color;
import javax.swing.border.EmptyBorder;

public class ButtonCopiarCpf extends JButton implements ButtonInterface {
    public ButtonCopiarCpf(){
        this.setBackground(new Color(204,204,204));
        this.setSize(32, 32);
        this.setEnabled(false);
        this.setBorder(new EmptyBorder(0,0,0,0));
    }
}
