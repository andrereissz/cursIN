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

public class CpfTextField extends JTextField implements TextFieldInterface {
    private int raio = 20;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public CpfTextField(){
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        this.setFont(font);
        this.setBorder(new EmptyBorder(6,6,6,6));
        this.setDocument(new LimitaCaracteres(14,LimitaCaracteres.TipoEntrada.CPF));
        this.addKeyListener(new KeyListener(){
            
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() != KeyEvent.VK_BACK_SPACE){
                    int posicao = getCaretPosition();
                    switch(posicao){
                        case 3 -> setText(getText()+".");
                        case 7 -> setText(getText()+".");
                        case 11 -> setText(getText()+"-");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e){}           
        });
    }
    
    
    @Override
    public void setText(String text){
        super.setText(text);
    }
    
    @Override
    public String getText(){
        return super.getText();
    }
    
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), raio, raio);
        super.paintComponent(g);
    }
}
