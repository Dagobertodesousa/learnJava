package swing;

import javax.swing.*;
import java.awt.*;
public class Grid_Layout extends JPanel{
    private JButton
        botao00, botao01, botao02,
        botao03, botao04, botao05,
        botao06, botao07, botao08,
        botao09, botao10, botao11,
        botao12, botao13, botao14;

    public Grid_Layout(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(new GridLayout(3, 4, 50, 120));
        botao00 = new JButton("Botao 00");
        botao01 = new JButton("Botao 01");
        botao02 = new JButton("Botao 02");
        botao03 = new JButton("Botao 03");
        botao04 = new JButton("Botao 04");
        botao05 = new JButton("Botao 05");
        botao06 = new JButton("Botao 06");
        botao07 = new JButton("Botao 07");
        botao08 = new JButton("Botao 08");
        botao09 = new JButton("Botao 09");
        botao10 = new JButton("Botao 10");
        botao11 = new JButton("Botao 11");
        botao12 = new JButton("Botao 12");
        botao13 = new JButton("Botao 13");
        botao14 = new JButton("Botao 14");
        botao00.setBounds(0, 0, 70, 25);
        botao01.setBounds(0, 0, 70, 25);
        botao02.setBounds(0, 0, 70, 25);
        botao03.setBounds(0, 0, 70, 25);
        botao04.setBounds(0, 0, 70, 25);
        botao05.setBounds(0, 0, 70, 25);
        botao06.setBounds(0, 0, 70, 25);
        botao07.setBounds(0, 0, 70, 25);
        botao08.setBounds(0, 0, 70, 25);
        botao09.setBounds(0, 0, 70, 25);
        botao10.setBounds(0, 0, 70, 25);
        botao11.setBounds(0, 0, 70, 25);
        botao12.setBounds(0, 0, 70, 25);
        botao13.setBounds(0, 0, 70, 25);
        botao14.setBounds(0, 0, 70, 25);
        add(botao00);
        add(botao01);
        add(botao02);
        add(botao03);
        add(botao04);
        add(botao05);
        add(botao06);
        add(botao07);
        add(botao08);
        add(botao09);
        add(botao10);
        add(botao11);
        add(botao12);
        add(botao13);
        add(botao14);
    }
}