package modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * fonte: http://devsv.wordpress.com/2012/07/08/como-implementar-um-tablemodel/
 */
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

// Implementacao do modelo da minha JTable.
public class ModelTable extends AbstractTableModel {

    private ArrayList linhas = null;
    private String[] colunas = null;

    public ModelTable(ArrayList lin, String[] col) {
        this.linhas = lin;
        this.colunas = col;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public int getRowCount() {
        return linhas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    // Expecifica o nome das colunas na tabela
    @Override
    public String getColumnName(int numCol) {
        return colunas[numCol];
    }

    // Retornas as informacoes na tabela
    public Object getValueAt(int numLinhas, int numColunas) {

        Object[] linha = (Object[]) getLinhas().get(numLinhas);

        return linha[numColunas];
    }

}
