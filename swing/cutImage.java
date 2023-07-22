package swing;

import java.awt.*;
import javax.swing.*;
public class cutImage extends JPanel{
    private JPanel[] painel = new JPanel[12];
    private JLabel rotulo;
    private ImageIcon imagem;

    public cutImage() {
        init();
    }

    private void init(){
        setLayout(new GridLayout(2, 6, 40, 20));
        imagem = new ImageIcon("imagens/peca_xadrez_3d.png");
        for (int i = 0; i < 12; i++){
            rotulo = new JLabel(imagem, JLabel.RIGHT);
            painel[i] = new JPanel();
            painel[i].setLocation(i * 100, i * 70);
            painel[i].createImage (70, 100);
            painel[i].add(rotulo);
            add(painel[i]);
        }
    }
}
