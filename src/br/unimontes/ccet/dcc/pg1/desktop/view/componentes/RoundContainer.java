package br.unimontes.ccet.dcc.pg1.desktop.view.componentes;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class RoundContainer extends JPanel implements PainelInterface{
    private int raio = 0;

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public RoundContainer(){
        this.setOpaque(false);
        this.setBorder(new EmptyBorder(0,0,0,0));
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
    public HashMap<String, Component> getMapComponentes(){
        HashMap<String, Component> mapa = new HashMap<>();
        Component[] componentes = this.getComponents();
        
        for(Component comp: componentes){
            mapa.put(comp.getName(), comp);
        }
        return mapa;
    }
}
