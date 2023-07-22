package swing;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
public class repImagem{
    public static void main(String ...args){
        File file = new File("imagens/peca_xadrez_real_madeira_verniz.png");
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        } catch (IOException e){
            e.printStackTrace(System.out);
        }
        if (image != null){
            mostrador(image);
        }
    }
    public static void mostrador(BufferedImage img){
        System.out.println("Carregando imagem...");
        JFrame frame = new JFrame();
        JLabel rotulo = new JLabel();
        ImageIcon imagem = new ImageIcon("imagens/peaoPreto.png");
        frame.setTitle("Imagem");
        frame.setSize(img.getWidth(), img.getHeight());
        rotulo.setIcon(new ImageIcon(img));
        frame.getContentPane().add(rotulo, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setIconImage(imagem.getImage());
        frame.pack();
        frame.setVisible(true);
    }
}