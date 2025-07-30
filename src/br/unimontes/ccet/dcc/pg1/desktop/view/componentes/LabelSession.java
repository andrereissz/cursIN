package br.unimontes.ccet.dcc.pg1.desktop.view.componentes;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.LabelInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Session;
import javax.swing.JLabel;

public class LabelSession extends JLabel implements LabelInterface{
    
    @Override
    public String getText(){
        return super.getText();
    }
    
    @Override
    public void setText(String text){
        super.setText(text);
    }
}
