package br.unimontes.ccet.dcc.pg1.desktop.view.interfaces;

public interface ComboBoxInterface{
    
    public Object getSelectedItem();
    public void addItem(String item);
    public void removeAllItems();
    public void removeItemAt(Integer index);
    public void setEnabled(Boolean x);
}
