package br.unimontes.ccet.dcc.pg1.desktop.view.paineis;

import javax.swing.JPanel;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.PainelInterface;
import java.awt.Component;
import java.util.HashMap;

public class Painel extends JPanel implements PainelInterface {

    @Override
    public HashMap<String, Component> getMapComponentes() {
        HashMap<String, Component> mapa = new HashMap<>();
        Component[] componentes = this.getComponents();
        
        for(Component comp: componentes){
            mapa.put(comp.getName(), comp);
        }
        return mapa;
    }
    
}
