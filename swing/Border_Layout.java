package swing;

import javax.swing.*;
import java.awt.*;
public class Border_Layout extends JPanel{
    private JButton south, north, center, west, east;

    public Border_Layout(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(new BorderLayout(20, 30));
        south = new JButton("vamos de sul");
        north = new JButton("pra o norte");
        center = new JButton("centrão");
        west = new JButton("west é leste?");
        east = new JButton("oeste é west ou east?");
        add("South", south);
        add("North", north);
        add("Center", center);
        add("West", west);
        add("East", east);
    }
}
