// Otavio Luiz Gonzaga - RA: a2648920

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class MedicamentoTableModel extends AbstractTableModel {

    private final String[] colunas = { "Nome", "Princípio Ativo", "Preço", "Dosagem (mg)" };
    private final List<Medicamento> medicamentos;

    public MedicamentoTableModel() {
        this.medicamentos = BDMedicamento.getInstance().getMedicamentos();
    }

    @Override
    public int getRowCount() {
        return medicamentos.size();
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
        Medicamento m = medicamentos.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> m.getNome();
            case 1 -> m.getPrincipioAtivo();
            case 2 -> m.getPreco();
            case 3 -> m.getDosagemMg();
            default -> null;
        };
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        Medicamento m = medicamentos.get(rowIndex);
        try {
            switch (columnIndex) {
                case 0 -> m.setNome(value.toString());
                case 1 -> m.setPrincipioAtivo(value.toString());
                case 2 -> m.setPreco(Float.parseFloat(value.toString()));
                case 3 -> m.setDosagemMg(Float.parseFloat(value.toString()));
            }
        } catch (Exception e) {
            System.err.println("Erro ao editar valor: " + e.getMessage());
        }

        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void removerLinha(int rowIndex) {
        medicamentos.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    public Medicamento getMedicamento(int rowIndex) {
        return medicamentos.get(rowIndex);
    }
}
