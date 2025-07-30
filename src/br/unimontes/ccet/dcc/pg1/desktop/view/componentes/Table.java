package br.unimontes.ccet.dcc.pg1.desktop.view.componentes;

import javax.swing.JTable;

import br.unimontes.ccet.dcc.pg1.desktop.view.interfaces.TableInterface;
import br.unimontes.ccet.dcc.pg1.desktop.view.util.Cores;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Table extends JTable implements TableInterface {

    public Table() {
        this.setSize(576, 0);
        /*
        DefaultTableModel model = (DefaultTableModel) this.getModel();
        DefaultTableCellRenderer centralizador = new DefaultTableCellRenderer();
        centralizador.setHorizontalAlignment(JLabel.CENTER);
        this.setDefaultRenderer(Integer.class, centralizador);
        this.setDefaultRenderer(String.class, centralizador);

        this.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        this.getTableHeader().setForeground(Color.WHITE);
        this.getTableHeader().setOpaque(false);
        this.setRowHeight(20);
        this.getTableHeader().setBackground(Cores.menu());
         */
    }

    @Override
    public TableModel getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(TableModel dataModel) {
        super.setModel(dataModel);
    }

    @Override
    public void setAutoResizeMode(int x) {
        super.setAutoResizeMode(x);
    }
}
