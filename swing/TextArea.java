package swing;

import java.awt.event.*;
import javax.swing.*;

public class TextArea extends JPanel{
    private JLabel estados;
    private JButton botaoMostrar;
    private JComboBox<String> caixaEstados;

    public TextArea(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        String[] caixaEstadosItems = {
            "Acre","Alagoas","Amazonas","Amapá",
            "Bahia","Ceara","DF","Espirito Santo",
            "Goias","Maranhão","Mato Grosso","Mato Grosso do Sul",
            "Minas Gerais","Pará","Paraná","Paraiba",
            "Pernambuco","Piauí","Rio de janeiro","Rio grande do Norte",
            "Rio Grande do Sul","Rondonia","Roraima","Santa Catarina",
            "Sergipe","São Paulo","Tocantins"
        };
        caixaEstados = new JComboBox<String>(caixaEstadosItems);
        estados = new JLabel("Estados:");
        botaoMostrar = new JButton("Mostrar");
        add(caixaEstados);
        add(estados);
        add(botaoMostrar);
        estados.setBounds(20, 20, 150, 25);
        caixaEstados.setBounds(20, 45, 150, 25);
        botaoMostrar.setBounds(20, 70, 150, 25);
    }

    private void definirEventos(){
        botaoMostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(
                    null, "indice selecionado: " + caixaEstados.getSelectedIndex() +
                    "\ntexto selecionado: " + caixaEstados.getSelectedItem());
            }
        });
    }
}