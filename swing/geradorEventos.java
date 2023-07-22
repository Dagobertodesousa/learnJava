package swing;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class geradorEventos extends JPanel{
    private JLabel rotulo;
    private JTextField texto;
    private JButton botao;

    public geradorEventos(){
        initComponents();
        setEvent();
    }

    private void initComponents() {
        setLayout(null);
        rotulo = new JLabel("Teste Texto");
        rotulo.setLocation(80, 100);
        rotulo.setSize(100, 30);
        texto = new JTextField("campo");
        texto.setLocation(220, 100);
        texto.setSize(100, 30);
        botao = new JButton("click");
        botao.setLocation(150, 150);
        botao.setSize(150, 40);
        botao.setBackground(Color.BLACK);
        botao.setForeground(Color.WHITE);
        add(rotulo);
        add(texto);
        add(botao);
    }

    private void setEvent() {
        botao.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(null, "click into (" + e.getX() + "," + e.getY() + ")");
            }
            public void mouseClicked(MouseEvent e){
                JOptionPane.showMessageDialog(null, "cursor on area");
            }
            public void mouseEntered(MouseEvent e){
                botao.setBackground(Color.WHITE);
                botao.setForeground(Color.BLACK);
            }
            public void mouseExited(MouseEvent e){
                botao.setBackground(Color.DARK_GRAY);
                botao.setForeground(Color.WHITE);
            }
            public void mouseReleased(MouseEvent e){
                JOptionPane.showMessageDialog(null, "off hold component");
            }
        });
        botao.addMouseMotionListener(new MouseMotionListener() {
            public void mouseMoved(MouseEvent e){
            }
            public void mouseDragged(MouseEvent e){}
        });
        texto.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "Pressed usado -- pressionada: " + e.getKeyChar() + "\n" + e.getKeyCode());
            }
            public void keyReleased(KeyEvent e) {
                JOptionPane.showMessageDialog(null, "Released usado -- pressionada: " + e.getKeyChar() + "\n" + e.getKeyCode());
            }
            public void keyTyped(KeyEvent e) {

            }
        });
    }
}
