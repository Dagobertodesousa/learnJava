package swing;

import java.awt.event.*;
import javax.swing.*;

public class Lista extends JPanel{
    private JButton botaoCalcular;
    private JLabel rotuloValor;
    private JTextField textoValor, textoValorDesconto;
    private JList<String> listaDesconto;
    private JScrollPane scrollLista;

    public Lista(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes(){
        setLayout(null);
        String[] listaValorDesconto = {"10%","20%","30%","40%","50%"};
        botaoCalcular = new JButton("Calcular");
        rotuloValor = new JLabel("Valor");
        textoValor = new JTextField(5);
        listaDesconto = new JList<String>(listaValorDesconto);
        textoValorDesconto = new JTextField(5);
        scrollLista = new JScrollPane(listaDesconto);
        botaoCalcular.setToolTipText("Me vê o preço ai");
        botaoCalcular.setMnemonic(KeyEvent.VK_C);
        botaoCalcular.setBounds(35, 120, 90, 25);
        rotuloValor.setBounds(35, 10, 100, 25);
        textoValor.setBounds(35, 35, 100, 25);
        scrollLista.setBounds(35, 60, 100, 55);
        textoValorDesconto.setBounds(35, 145, 100, 25);
        add(botaoCalcular);
        add(rotuloValor);
        add(textoValor);
        add(scrollLista);
        add(textoValorDesconto);
    };

    private void definirEventos(){
        botaoCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                if (textoValor.getText().equals("")){
                    textoValor.requestFocus();
                    return;
                }
                try {
                    float valor = Float.parseFloat(textoValor.getText());
                    if (listaDesconto.getSelectedIndex() == -1){
                        JOptionPane.showMessageDialog(null, "Selecione item: ");
                        return;
                    }
                    float desconto = .9f;
                    if (listaDesconto.getSelectedIndex() == 1){
                        desconto = .8f;
                    } else
                    if (listaDesconto.getSelectedIndex() == 2){
                        desconto = .7f;
                    } else
                    if (listaDesconto.getSelectedIndex() == 3){
                        desconto = .6f;
                    } else
                    if (listaDesconto.getSelectedIndex() == 4){
                        desconto = .5f;
                    }
                    textoValorDesconto.setText("" + (valor * desconto));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas numéricos\n" + e.toString());
                    textoValor.requestFocus();
                }
            }
        });
    };
}