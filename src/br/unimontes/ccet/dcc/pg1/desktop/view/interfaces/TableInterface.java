package br.unimontes.ccet.dcc.pg1.desktop.view.interfaces;

import javax.swing.table.TableModel;

public interface TableInterface {
    
    public TableModel getModel();
    public void setModel(TableModel dataModel);
    
    public int getSelectedRow();
    public void setAutoResizeMode(int x);
    
}
