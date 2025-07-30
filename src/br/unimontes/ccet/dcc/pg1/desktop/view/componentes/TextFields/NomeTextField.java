package br.unimontes.ccet.dcc.pg1.desktop.view.componentes.TextFields;

import javax.swing.JTextField;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.LimitaCaracteres;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TextFieldInterface;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.border.EmptyBorder;

public class NomeTextField extends JTextField implements TextFieldInterface {
private int raio = 20;
    private boolean vazio;
    
    public boolean getVazio(){
        return vazio;
    }
    
    public void setVazio(boolean vazio){
        this.vazio = vazio;
    }
    
    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public NomeTextField(){
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        this.setFont(font);
        this.setText("Nome");
        this.setForeground(Color.GRAY);
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(6,6,6,6));
        this.setDocument(new LimitaCaracteres(240,LimitaCaracteres.TipoEntrada.NOME));
        
        addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(getText().isBlank() == true){
                    setText("");
                    setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {}
            
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