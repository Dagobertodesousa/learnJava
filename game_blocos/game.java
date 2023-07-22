package game_blocos;

import java.awt.*;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.*;
public class game extends JPanel{
    private JPanel frame;
    private JLabel rotulo;
    private Date date;

    public game(){
        initComponents();
        setEvents();
    }

    private void initComponents(){
        setLayout(null);
        date = new Date();
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat timeformat = DateFormat.getTimeInstance();
        rotulo = new JLabel(dateformat.format(date) + " | " + timeformat.format(date));
        rotulo.setForeground(Color.WHITE);
        rotulo.setBounds(100, 720, 50, 50);
        frame = new JPanel();
        //Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setSize(600, 800);
        frame.setLocation(100,100);
        frame.setBackground(Color.DARK_GRAY);
        frame.setForeground(Color.WHITE);
        frame.add(rotulo);
        add(frame);
    }

    private void setEvents(){
    }
}
