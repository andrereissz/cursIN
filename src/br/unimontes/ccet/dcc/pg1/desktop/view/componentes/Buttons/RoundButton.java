package br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons;

import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class RoundButton extends JButton {
    private boolean over;
    private Color cor;
    private Color corOver;
    private Color corClick;
    private int raio = 30;

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Color getCorOver() {
        return corOver;
    }

    public void setCorOver(Color corOver) {
        this.corOver = corOver;
    }

    public Color getCorClick() {
        return corClick;
    }

    public void setCorClick(Color corClick) {
        this.corClick = corClick;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    
    public RoundButton(){  
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        this.setFont(font);
        cor = Cores.menu();
        this.setBackground(cor);
        corOver = Cores.selected();
        corClick = Cores.clicked();
        this.setForeground(Color.WHITE);
        this.setFocusPainted(false);
        this.setContentAreaFilled(false);
        this.setBorder(new EmptyBorder(0,0,0,0));
        
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent me){
                setBackground(corOver);
                over = true;
            }
            @Override
            public void mouseExited(MouseEvent me){
                setBackground(cor);
                over = false;
            }
            @Override
            public void mousePressed(MouseEvent me){
                setBackground(corClick);
            }
            @Override
            public void mouseReleased(MouseEvent me){
                if(over){
                    setBackground(corOver);
                }
                else{
                    setBackground(cor);
                }
            }
        });
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
