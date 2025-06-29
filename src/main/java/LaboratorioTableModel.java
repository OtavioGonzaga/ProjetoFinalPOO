// Otavio Luiz Gonzaga - RA: a2648920

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class LaboratorioTableModel extends AbstractTableModel {

    private final String[] colunas = { "Nome", "CNPJ", "Endereço", "Telefone", "Email" };
    private final List<Laboratorio> laboratorios;

    public LaboratorioTableModel() {
        this.laboratorios = BDLaboratorio.getInstance().getLaboratorios();
    }

    @Override
    public int getRowCount() {
        return laboratorios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Laboratorio l = laboratorios.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> l.getNome();
            case 1 -> l.getCnpj();
            case 2 -> l.getEndereco();
            case 3 -> l.getTelefone();
            case 4 -> l.getEmail();
            default -> null;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Laboratorio l = laboratorios.get(rowIndex);
        try {
            switch (columnIndex) {
                case 0 -> l.setNome(value.toString());
                case 1 -> l.setCnpj(value.toString());
                case 2 -> l.setEndereco(value.toString());
                case 3 -> l.setTelefone(value.toString());
                case 4 -> l.setEmail(value.toString());
            }
        } catch (Exception e) {
            System.err.println("Erro ao editar valor: " + e.getMessage());
        }

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void removerLinha(int rowIndex) {
        laboratorios.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Laboratorio getLaboratorio(int rowIndex) {
        return laboratorios.get(rowIndex);
    }
}
