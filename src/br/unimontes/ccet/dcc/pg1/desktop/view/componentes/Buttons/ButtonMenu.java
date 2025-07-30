package br.unimontes.ccet.dcc.pg1.desktop.view.componentes.Buttons;

import javax.swing.JButton;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ButtonInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EmptyBorder;

public class ButtonMenu extends JButton implements ButtonInterface {
    private boolean over;
    private Color cor;
    private Color corOver;
    private Color corClick;

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
    
    
    public ButtonMenu(){  
        Font font = new Font("Segoe UI", Font.BOLD, 16);
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
    
}
