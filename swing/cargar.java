package swing;

import java.awt.event.*;
import javax.swing.*;

import swing.ScoreBoard.MainPanel;
public class cargar extends JFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.addWindowListener(new WindowListener() {
            public void windowClosing(WindowEvent e){}
            public void windowClosed(WindowEvent e){}
            public void windowActivated(WindowEvent e){}
            public void windowDeactivated(WindowEvent e){}
            public void windowIconified(WindowEvent e){}
            public void windowDeiconified(WindowEvent e){}
            public void windowOpened(WindowEvent e){}
        });
        frame.addComponentListener(new ComponentListener() {
            public void componentResized(ComponentEvent e){}
            public void componentMoved(ComponentEvent e){}
            public void componentShown(ComponentEvent e){}
            public void componentHidden(ComponentEvent e){}
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new MainPanel());
        frame.setBounds(0, 0, 900, 700);
        frame.setVisible(true);
    }
}