package swing;

import java.awt.*;
import javax.swing.*;
public class Tabuleiro extends JPanel{
    private JPanel[] painel = new JPanel[64];
    private JLabel plano;

    public Tabuleiro(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(new GridLayout(8, 8, 2, 2));
        setBackground(Color.LIGHT_GRAY);
        for (int i = 0; i < painel.length; i++){
            painel[i] = new JPanel();
            if(i % 2 == 0) {
                plano = new JLabel("plano "+ i);
                painel[i].setBackground(Color.BLACK);
            } else if (i % 2 != 0) {
                plano = new JLabel("plano "+ i);
                painel[i].setBackground(Color.WHITE);
            }
            painel[i].add(plano);
            add(painel[i]);
        }
    }
}
