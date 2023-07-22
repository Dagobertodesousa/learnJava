package swing;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.*;

public class Rotulo extends JLabel{
    private JLabel rotuloMono, rotuloSix, rotuloCegueta;
    private ImageIcon mono, six, cegueta;

    public Rotulo(){
        inicializarComponentes();
    }

    private void inicializarComponentes(){
        setLayout(new GridLayout(3, 1));
        mono = new ImageIcon("swing/image/foto10.png");
        six = new ImageIcon("swing/image/foto2.png");
        cegueta = new ImageIcon("swing/image/cegueta.jpeg");
        setBackground(new Color(250, 80, 140));
        rotuloSix = new JLabel(" Six", six, JLabel.LEFT);
        rotuloSix.setForeground(Color.red);
        rotuloMono = new JLabel(" Mono", mono, JLabel.LEFT);
        rotuloMono.setForeground(Color.darkGray);
        rotuloCegueta = new JLabel("Cegueta ", cegueta, JLabel.RIGHT);
        rotuloCegueta.setFont(new Font("Serif", Font.BOLD, 18));
        rotuloCegueta.setForeground(Color.BLACK);
        add(rotuloSix);
        add(rotuloMono);
        add(rotuloCegueta);
    }
}