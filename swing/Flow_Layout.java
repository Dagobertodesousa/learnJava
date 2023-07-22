package swing;

import javax.swing.*;
import java.awt.*;
public class Flow_Layout extends JPanel{
    private JButton  botao00, botao01, botao02, botao03, botao04, botao05, botao06, botao07, botao08;

    public Flow_Layout(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(new FlowLayout(1, 40, 50));
        botao00 = new JButton("Botao 00");
        botao00.setBounds(50, 100, 70, 25);
        botao01 = new JButton("Botao 01");
        botao01.setBounds(150, 100, 70, 25);
        botao02 = new JButton("Botao 02");
        botao02.setBounds(250, 100, 70, 25);
        botao03 = new JButton("Botao 03");
        botao03.setBounds(350, 100, 70, 25);
        botao04 = new JButton("Botao 04");
        botao04.setBounds(450, 100, 70, 25);
        botao05 = new JButton("Botao 05");
        botao05.setBounds(550, 100, 70, 25);
        botao06 = new JButton("Botao 06");
        botao06.setBounds(560, 100, 70, 25);
        botao07 = new JButton("Botao 07");
        botao07.setBounds(750, 100, 70, 25);
        botao08 = new JButton("Botao 08");
        botao08.setBounds(850, 100, 70, 25);
        add(botao00);
        add(botao01);
        add(botao02);
        add(botao03);
        add(botao04);
        add(botao05);
        add(botao06);
        add(botao07);
        add(botao08);
    }
}