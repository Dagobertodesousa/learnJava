package swing;

import javax.swing.*;
import java.awt.*;

public class AbasFrame extends JPanel{
    private JTabbedPane Abas;
    private JButton botoes[] = new JButton[100];

    public AbasFrame(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(null);
        Abas = new JTabbedPane();
        for (int i = 0; i < botoes.length; i++){
            botoes[i] = new JButton("Botao " + (i+1));
        }
        JPanel primeiroPainel = new JPanel(new GridLayout(5, 1));
        for (int pp = 0; pp <= 4; pp++){
            primeiroPainel.add(botoes[pp]);
        }
        JPanel segundoPainel = new JPanel(new GridLayout(5, 1));
        for (int pp = 5; pp <= 9; pp++){
            segundoPainel.add(botoes[pp]);
        }
        JPanel terceiroPainel = new JPanel(new FlowLayout(8, 10, 20));
        for (int pp = 10; pp < 95; pp++){
            terceiroPainel.add(botoes[pp]);
        }
        JPanel quartoPainel = new JPanel(new BorderLayout(40, 50));
        quartoPainel.add(botoes[95], "Center");
        quartoPainel.add(botoes[96], "North");
        quartoPainel.add(botoes[97], "South");
        quartoPainel.add(botoes[98], "West");
        quartoPainel.add(botoes[99], "East");
        Abas = new JTabbedPane();
        Abas.addTab("GridLayout", primeiroPainel);
        Abas.addTab("GridLayout", segundoPainel);
        Abas.addTab("FlowLayout", terceiroPainel);
        Abas.addTab("BorderLayout", quartoPainel);
        Abas.setBounds(5, 10, 775, 485);
        add(Abas);
    }
}