package br.unimontes.ccet.dcc.pg1.desktop.view.componentes;

import javax.swing.JComboBox;
import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.ComboBoxInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import java.awt.Color;
import java.awt.Font;

public class ComboBoxCursos extends JComboBox implements ComboBoxInterface {

    public ComboBoxCursos() {
        this.setBackground(Cores.menu());
        this.setForeground(Color.WHITE);
        Font font = new Font("Segoe UI", Font.BOLD, 14);
        this.setFont(font);
        this.addItem(" ");
        
        /*addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt){
                    load();
                    loaded = 1;
            }
        });*/
    }
  
    @Override
    public Object getSelectedItem() {
        return super.getSelectedItem().toString();
    }

    @Override
    public void addItem(String item) {
        super.addItem(item);
    }

    @Override
    public void removeAllItems(){
        super.removeAllItems();
    }
    
    @Override
    public void removeItemAt(Integer index){
        super.removeItemAt(index);
    }
    
    @Override
    public void setEnabled(Boolean x){
        super.setEnabled(x);
    }
}
