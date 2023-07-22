package swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Progress extends JPanel{
    private JProgressBar barraProgresso;
    private JButton aumenta, diminui;

    public Progress(){
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes(){
        setLayout(null);
        barraProgresso = new JProgressBar();
        barraProgresso.setForeground(Color.CYAN);
        barraProgresso.setBounds(25, 50, 200, 20);
        aumenta = new JButton("Aumentar", (new ImageIcon("swing/progress/aumentar.png")));
        aumenta.setBounds(180, 100, 70, 70);
        aumenta.setMnemonic('A');
        diminui = new JButton("Diminuir", (new ImageIcon("swing/progress/diminuir.png")));
        diminui.setBounds(60, 100, 70, 70);
        diminui.setMnemonic('D');
        add(barraProgresso);
        add(aumenta);
        add(diminui);
    }

    private void definirEventos(){
        aumenta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                barraProgresso.setValue(barraProgresso.getValue() + 5);
            }
        });
        diminui.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                barraProgresso.setValue(barraProgresso.getValue() - 5);
            }
        });
    }
}
