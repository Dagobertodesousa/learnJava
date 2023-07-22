package swing;

import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Grade extends JPanel{
    private JPanel painelTabela, painelPrincipal;
    private JButton botaoAdicionar, botaoRemover;
    private JScrollPane scrollTabela;
    private JTable tabela;
    private JLabel lNumero, lTotal, lProduto, lPrecoUnitario, lQuantidade;
    private JTextField tNumero, tTotal, tProduto, tPrecoUnitario, tQuantidade;
    DecimalFormat df = new DecimalFormat("#,###.00");

    public Grade(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes(){
        setLayout(null);
        lNumero = new JLabel("Numero do Pedido:", SwingConstants.CENTER);
        lProduto = new JLabel("Produto", SwingConstants.CENTER);
        lQuantidade = new JLabel("Quant", SwingConstants.CENTER);
        lPrecoUnitario = new JLabel("Preço Unitário", SwingConstants.CENTER);
        lTotal = new JLabel("Total do Pedido: ", SwingConstants.CENTER);
        
        tNumero = new JTextField();
        tProduto = new JTextField();
        tPrecoUnitario = new JTextField();
        tQuantidade = new JTextField();
        tTotal = new JTextField();
        tTotal.setEnabled(false);
        tTotal.setHorizontalAlignment(JTextField.RIGHT);

        botaoAdicionar = new JButton("Add");
        botaoAdicionar.setToolTipText("Adiciona item");
        botaoRemover = new JButton("Remove");
        botaoRemover.setToolTipText("Remove item");

        lNumero.setBounds(15, 10, 120, 25);
        tNumero.setBounds(130, 10, 50, 25);
        lProduto.setBounds(15, 40, 200, 25);
        tProduto.setBounds(15, 65, 200, 25);
        lQuantidade.setBounds(225, 40, 60, 25);
        tQuantidade.setBounds(225, 65, 60, 25);
        lPrecoUnitario.setBounds(295, 40, 100, 25);
        tPrecoUnitario.setBounds(295, 65, 100, 25);
        tTotal.setBounds(375, 360, 100, 25);
        lTotal.setBounds(278, 360, 100, 25);

        botaoAdicionar.setBounds(15, 100, 80, 20);
        botaoRemover.setBounds(125, 100, 80, 20);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(null);
        painelPrincipal.setBounds(0, 0, 800, 600);

        painelPrincipal.add(lNumero);
        painelPrincipal.add(lPrecoUnitario);
        painelPrincipal.add(lProduto);
        painelPrincipal.add(lQuantidade);
        painelPrincipal.add(lTotal);
        painelPrincipal.add(tProduto);
        painelPrincipal.add(tQuantidade);
        painelPrincipal.add(tNumero);
        painelPrincipal.add(tPrecoUnitario);
        painelPrincipal.add(tTotal);

        painelTabela = new JPanel(new BorderLayout());
        painelTabela.setBorder(new TitledBorder("Itens do pedido"));
        scrollTabela = new JScrollPane();

        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);

        painelPrincipal.add(botaoAdicionar);
        painelPrincipal.add(botaoRemover);

        DefaultTableModel modeloTabela = new DefaultTableModel(
            new String[] {"Produto","Quant","Preço Unitário","Total"},0) {
                public boolean isCellEditable(int row, int col) {
                    if (col == 3){
                        return false;
                    }
                    return true;
                }
            };
        tabela = new JTable(modeloTabela);
        DefaultTableCellRenderer alinhaCentro = new DefaultTableCellRenderer();
        alinhaCentro.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
        alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(50);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(1).setCellRenderer(alinhaCentro);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);
        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        scrollTabela.setViewportView(tabela);
        painelTabela.add(scrollTabela);
        painelTabela.setBounds(10, 130, 470, 230);
        painelPrincipal.add(painelTabela);
        add(painelPrincipal);
    }

    private void definirEventos(){
        botaoAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tProduto.getText().isBlank() || tQuantidade.getText().isBlank() || tPrecoUnitario.getText().isBlank())
                {
                    JOptionPane.showMessageDialog(tabela, "Preencher campos!");
                    return;
                }
                DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
                dtm.addRow(new Object[] {
                    tProduto.getText(),
                    tQuantidade.getText(),
                    (Object) df.format(Double.parseDouble(tPrecoUnitario.getText())),
                    "" + df.format(Integer.parseInt(tQuantidade.getText()) * Double.parseDouble(tPrecoUnitario.getText()))
                });
                limparCampos();
                calcularTotal();
            }
        });
        botaoRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int[] linhas = tabela.getSelectedRows();
                DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
                for (int i = (linhas.length - 1); i >= 0; i++) {
                    dtm.removeRow(linhas[i]);
                }
                calcularTotal();
            }
        });
    };

    private void calcularTotal(){
        double total = 0;
        for (int linha = 0; linha < tabela.getRowCount(); linha++) {
            String valor = "" + tabela.getValueAt(linha, 3);
            valor = valor.replace(".", "");
            valor = valor.replace(",", ".");
            total += Double.parseDouble(valor);
        }
        tTotal.setText("" + df.format(total));
    };
    
    private void limparCampos(){
        tProduto.setText("");
        tQuantidade.setText("1");
        tPrecoUnitario.setText("");
        tProduto.requestFocus();
    };
}