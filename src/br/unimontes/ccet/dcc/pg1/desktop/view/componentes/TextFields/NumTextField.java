package br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields;

import javax.swing.JTextField;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.LimitaCaracteres;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.border.EmptyBorder;

public class NumTextField extends JTextField implements TextFieldInterface {
    private int raio = 20;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    public NumTextField(){
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        this.setFont(font);
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(6,6,6,6));
        this.setDocument(new LimitaCaracteres(3,LimitaCaracteres.TipoEntrada.NUM));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), raio, raio);
        super.paintComponent(g);
    }
    
    @Override
    public void setText(String text){
        super.setText(text);
    }
    
    @Override
    public String getText(){
        return super.getText();
    }
}
