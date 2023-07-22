package swing.ScoreBoard;

import java.awt.*;
import java.awt.event.*;
import java.lang.NullPointerException;
import javax.swing.*;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainPanel extends JPanel{
    private Container painelRaiz;
    private JDesktopPane componentLocal, componentVisitante, componentTimer;
    private JLabel
        eqLocal, eqVisitante,   //mostrador nome de equipe
        eqPlacarLocal, eqPlacarVisitante,   //mostrador de placar
        tempoTecnicoLocal, tempoTecnicoVisitante,
        foulLocal, foulVisitante,
        clock, periodo, shotClock;
    private JButton
        btPontuarVisitante2, btPontuarLocal2, btPontuarVisitante1, btPontuarLocal1, btPontuarVisitante3, btPontuarLocal3,   // botão de acréscimo de pontos
        btTempoTecnicoLocal, btTempoTecnicoVisitante,   // botão de pedido de tempo técnico
        btFoulLocal, btFoulVisitante,
        btAlternarQuarto, bt24s, bt14s, btBuzzer,
        btClock;
    public MainPanel(){
        initComponents();
        setEvents();
    }

    private void initComponents(){
        setLayout(new GridLayout());
        Font
            font = new Font(Font.SANS_SERIF, Font.ITALIC, 25),
            fontPonto = new Font(Font.SERIF, Font.ITALIC, 36),
            fontClock = new Font(Font.MONOSPACED, Font.BOLD, 48);
        
        painelRaiz = new Container();
        componentLocal = new JDesktopPane();
        componentLocal.setLocation(0, 100);
        componentLocal.setSize(200, 600);

        componentTimer = new JDesktopPane();
        componentTimer.setLocation(200, 100);
        componentTimer.setSize(400, 600);

        componentVisitante = new JDesktopPane();
        componentVisitante.setLocation(600, 100);
        componentVisitante.setSize(200, 600);

        eqLocal = new JLabel("Local");
        eqLocal.setFont(font);
        eqLocal.setLocation(50, 10);
        eqLocal.setSize(100, 30);
        btPontuarLocal1 = new JButton("1");
        btPontuarLocal1.setLocation(40, 50);
        btPontuarLocal1.setSize(80 , 60);
        btPontuarLocal1.setBackground(Color.DARK_GRAY);
        btPontuarLocal1.setForeground(Color.GRAY);
        btPontuarLocal1.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
        btPontuarLocal1.setFont(font);
        btPontuarLocal2 = new JButton("2");
        btPontuarLocal2.setLocation(40, 150);
        btPontuarLocal2.setSize(80 , 60);
        btPontuarLocal2.setBackground(Color.DARK_GRAY);
        btPontuarLocal2.setForeground(Color.GRAY);
        btPontuarLocal2.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
        btPontuarLocal2.setFont(font);
        btPontuarLocal3 = new JButton("3");
        btPontuarLocal3.setLocation(40, 250);
        btPontuarLocal3.setSize(80 , 60);
        btPontuarLocal3.setBackground(Color.DARK_GRAY);
        btPontuarLocal3.setForeground(Color.GRAY);
        btPontuarLocal3.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 1));
        btPontuarLocal3.setFont(font);
        
        eqVisitante = new JLabel("Visitante");
        eqVisitante.setLocation(50, 10);
        eqVisitante.setSize(100, 30);
        eqVisitante.setFont(font);
        btPontuarVisitante1 = new JButton("1");
        btPontuarVisitante1.setLocation(40, 50);
        btPontuarVisitante1.setSize(80 , 60);
        btPontuarVisitante1.setBackground(Color.DARK_GRAY);
        btPontuarVisitante1.setForeground(Color.GRAY);
        btPontuarVisitante1.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
        btPontuarVisitante1.setFont(font);
        btPontuarVisitante2 = new JButton("2");
        btPontuarVisitante2.setLocation(40, 150);
        btPontuarVisitante2.setSize(80 , 60);
        btPontuarVisitante2.setBackground(Color.DARK_GRAY);
        btPontuarVisitante2.setForeground(Color.GRAY);
        btPontuarVisitante2.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
        btPontuarVisitante2.setFont(font);
        btPontuarVisitante3 = new JButton("3");
        btPontuarVisitante3.setLocation(40, 250);
        btPontuarVisitante3.setSize(80 , 60);
        btPontuarVisitante3.setBackground(Color.DARK_GRAY);
        btPontuarVisitante3.setForeground(Color.GRAY);
        btPontuarVisitante3.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
        btPontuarVisitante3.setFont(font);
        
        clock = new JLabel("00:00:00");
        clock.setFont(fontClock);
        clock.setBounds(130, 20, 200, 40);
        shotClock = new JLabel("00:00");
        shotClock.setFont(fontClock);
        shotClock.setForeground(Color.RED);
        shotClock.setBounds(130, 80, 150, 40);
        
        eqPlacarLocal = new JLabel("00", JLabel.CENTER);
        eqPlacarLocal.setFont(fontPonto);
        eqPlacarLocal.setBounds(40, 120, 60, 60);

        eqPlacarVisitante = new JLabel("00", JLabel.CENTER);
        eqPlacarVisitante.setBounds(300, 120, 60, 60);
        eqPlacarVisitante.setFont(fontPonto);

        bt14s = new JButton("14");
        bt14s.setBounds(40, 180, 60, 30);
        btClock = new JButton("Timer");
        btClock.setBounds(160, 180, 80, 30);
        btClock.setForeground(Color.DARK_GRAY);
        bt24s = new JButton("24");
        bt24s.setBounds(300, 180, 60, 30);
        
        foulLocal = new JLabel("0", JLabel.CENTER);
        foulLocal.setFont(font);
        foulLocal.setBounds(40, 220, 80, 60);
        btFoulLocal = new JButton("Foul L");
        btFoulLocal.setForeground(Color.red);
        btFoulLocal.setBounds(40, 290, 80, 30);

        foulVisitante = new JLabel("0", JLabel.CENTER);
        foulVisitante.setFont(font);
        foulVisitante.setBounds(300, 220, 80, 60);
        btFoulVisitante = new JButton("Foul V");
        btFoulVisitante.setForeground(Color.red);
        btFoulVisitante.setBounds(300, 290, 80, 30);

        periodo = new JLabel("1", JLabel.CENTER);
        periodo.setFont(font);
        periodo.setBounds(160, 220, 80, 60);
        btAlternarQuarto = new JButton("Periodo");
        btAlternarQuarto.setBounds(160, 290, 80, 30);

        tempoTecnicoLocal = new JLabel("0", JLabel.CENTER);
        tempoTecnicoLocal.setBounds(40, 330, 80, 60);
        tempoTecnicoLocal.setFont(font);
        btTempoTecnicoLocal = new JButton("Tempo L");
        btTempoTecnicoLocal.setBounds(40, 400, 80, 30);

        tempoTecnicoVisitante = new JLabel("0", JLabel.CENTER);
        tempoTecnicoVisitante.setBounds(300, 330, 80, 60);
        tempoTecnicoVisitante.setFont(font);
        btTempoTecnicoVisitante = new JButton("Temnpo V");
        btTempoTecnicoVisitante.setBounds(300, 400, 80, 30);

        btBuzzer = new JButton(new ImageIcon("imagens/play.png"));
        btBuzzer.setBounds(170, 510, 40, 40);

        componentLocal.add(eqLocal);
        componentLocal.add(btPontuarLocal1);
        componentLocal.add(btPontuarLocal2);
        componentLocal.add(btPontuarLocal3);

        componentTimer.add(clock);
        componentTimer.add(shotClock);
        componentTimer.add(btClock);
        componentTimer.add(eqPlacarLocal);
        componentTimer.add(eqPlacarVisitante);
        componentTimer.add(bt14s);
        componentTimer.add(bt24s);
        componentTimer.add(btFoulLocal);
        componentTimer.add(btFoulVisitante);
        componentTimer.add(foulLocal);
        componentTimer.add(foulVisitante);
        componentTimer.add(periodo);
        componentTimer.add(btAlternarQuarto);
        componentTimer.add(btBuzzer);
        componentTimer.add(tempoTecnicoLocal);
        componentTimer.add(tempoTecnicoVisitante);
        componentTimer.add(btTempoTecnicoLocal);
        componentTimer.add(btTempoTecnicoVisitante);

        componentVisitante.add(eqVisitante);
        componentVisitante.add(btPontuarVisitante1);
        componentVisitante.add(btPontuarVisitante2);
        componentVisitante.add(btPontuarVisitante3);

        painelRaiz.add(componentLocal, "West");
        painelRaiz.add(componentTimer, "Center");
        painelRaiz.add(componentVisitante, "East");
        add(painelRaiz);
    }

    private void setEvents(){
        bt14s.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e){}
            public void mouseMoved(MouseEvent e){
                bt14s.setForeground(Color.LIGHT_GRAY);
                bt14s.setBackground(Color.WHITE);
            }
        });
        bt24s.addMouseMotionListener(new MouseMotionListener() {
            public void mouseDragged(MouseEvent e){}
            public void mouseMoved(MouseEvent e){
                bt24s.setForeground(Color.LIGHT_GRAY);
                bt24s.setBackground(Color.WHITE);
            }
        });
        eqLocal.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){}
            public void mouseClicked(MouseEvent e){
                try {
                    String newLocal = JOptionPane.showInputDialog(null, "Nome da Equipe Local:", "Local", JOptionPane.PLAIN_MESSAGE);
                    switch (newLocal) {
                        case "":
                            break;
                        default:
                            eqLocal.setText(newLocal.toUpperCase());
                            break;
                    }
                } catch (NullPointerException n) {
                    System.out.println("DEU ERRO VIU" + e.toString());
                }
            }
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
        });
        eqVisitante.addMouseListener(new MouseListener() {
            public void mousePressed(MouseEvent e){}
            public void mouseClicked(MouseEvent e){
                try {
                    String newLocal = JOptionPane.showInputDialog(null, "Nome da Equipe Local:", "Local", JOptionPane.PLAIN_MESSAGE);
                    switch (newLocal) {
                        case "":
                            break;
                        default:
                            eqVisitante.setText(newLocal.toUpperCase());
                            break;
                    }
                } catch (NullPointerException n) {
                    System.out.println("DEU ERRO VIU" + e.toString());
                }
            }
            public void mouseEntered(MouseEvent e){}
            public void mouseExited(MouseEvent e){}
            public void mouseReleased(MouseEvent e){}
        });
        btPontuarLocal1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarLocal.getText()) + Integer.parseInt(btPontuarLocal1.getText());
                eqPlacarLocal.setText(String.valueOf(atual));
            }
        });
        btPontuarLocal1.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                btPontuarLocal1.setText("-1");
            }
            public void keyTyped(KeyEvent e){
                btPontuarLocal1.setText("1");
            }
            public void keyReleased(KeyEvent e){}
        });
        btPontuarLocal2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarLocal.getText()) + Integer.parseInt(btPontuarLocal2.getText());
                eqPlacarLocal.setText(String.valueOf(atual));
            }
        });
        btPontuarLocal2.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                btPontuarLocal2.setText("-2");
            }
            public void keyTyped(KeyEvent e){
                btPontuarLocal2.setText("2");
            }
            public void keyReleased(KeyEvent e){}
        });
        btPontuarLocal3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarLocal.getText()) + Integer.parseInt(btPontuarLocal3.getText());
                eqPlacarLocal.setText(String.valueOf(atual));
            }
        });
        btPontuarLocal3.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e){
                btPontuarLocal3.setText("-3");
            }
            public void keyTyped(KeyEvent e){
                btPontuarLocal3.setText("3");
            }
            public void keyReleased(KeyEvent e){}
        });
        btPontuarVisitante1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarVisitante.getText()) + Integer.parseInt(btPontuarVisitante1.getText());
                eqPlacarVisitante.setText(String.valueOf(atual));
            }
        });
        btPontuarVisitante2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarVisitante.getText()) + Integer.parseInt(btPontuarVisitante2.getText());
                eqPlacarVisitante.setText(String.valueOf(atual));
            }
        });
        btPontuarVisitante3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int atual = Integer.parseInt(eqPlacarVisitante.getText()) + Integer.parseInt(btPontuarVisitante3.getText());
                eqPlacarVisitante.setText(String.valueOf(atual));
            }
        });
        btClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Timer timer = new Timer(), shotClock = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    int
                        minuto = Integer.parseInt(JOptionPane.showInputDialog(null, "Minutos Restantes", 10)),
                        segundo = Integer.parseInt(JOptionPane.showInputDialog(null, "Segundos Restantes", 0));
                    int i = ((minuto * 60) + segundo) * 1000;
                    public void run() {
                        clock.setText(minuto+":"+segundo);
                        i--;
                        if (i < 0){
                            timer.cancel();
                            clock.setText("end time");
                        }
                    }
                }, 0, 10);
                shotClock.scheduleAtFixedRate(new TimerTask() {
                    int j = 2400;
                    public void run(){
                        MainPanel.this.shotClock.setText(String.valueOf(j));
                        j--;
                        if (j < 0){
                            shotClock.cancel();
                            timer.cancel();
                            MainPanel.this.shotClock.setText("PAN");
                        }
                    }
                },  0, 10);
            }
        });
        clock.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
                clock.setText((String) JOptionPane.showInputDialog(null, "Tempo Restante de Jogo: ", "Timer", JOptionPane.OK_OPTION));
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
        btAlternarQuarto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (periodo.getText()){
                    case "1":
                    case "2":
                    case "3":
                        periodo.setText(String.valueOf(Integer.parseInt(periodo.getText()) + 1));
                    break;
                    case "4":
                        periodo.setText("OT");
                    break;
                    case "OT":
                        periodo.setText("1");
                    break;
                }
            }
        });
        btFoulLocal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (foulLocal.getText()){
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                        foulLocal.setText(String.valueOf(Integer.parseInt(foulLocal.getText()) + 1));
                    break;
                    case "4":
                        foulLocal.setText(String.valueOf(Integer.parseInt(foulLocal.getText()) + 1));
                        foulLocal.setForeground(Color.RED);
                    break;
                    case "5":
                        foulLocal.setForeground(Color.BLACK);
                        foulLocal.setText("0");
                    break;
                }
            }
        });
        btFoulVisitante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (foulVisitante.getText()){
                    case "0":
                    case "1":
                    case "2":
                    case "3":
                        foulVisitante.setText(String.valueOf(Integer.parseInt(foulVisitante.getText()) + 1));
                    break;
                    case "4":
                        foulVisitante.setText(String.valueOf(Integer.parseInt(foulVisitante.getText()) + 1));
                        foulVisitante.setForeground(Color.RED);
                    break;
                    case "5":
                        foulVisitante.setForeground(Color.BLACK);
                        foulVisitante.setText("0");
                    break;
                }
            }
        });
        btTempoTecnicoLocal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (periodo.getText()){
                    case "1":
                    case "2":
                        if (tempoTecnicoLocal.getText() == "0") tempoTecnicoLocal.setText("T");
                        else if (tempoTecnicoLocal.getText() == "T") tempoTecnicoLocal.setText("TT");
                        else tempoTecnicoLocal.setText("0");
                    break;
                    case "3":
                    case "4":
                    case "OT":
                        if (tempoTecnicoLocal.getText() == "0") tempoTecnicoLocal.setText("T");
                        else if (tempoTecnicoLocal.getText() == "T") tempoTecnicoLocal.setText("TT");
                        else if (tempoTecnicoLocal.getText() == "TT") tempoTecnicoLocal.setText("TTT");
                        else tempoTecnicoLocal.setText("0");
                    break;
                }
            }
        });
        btTempoTecnicoVisitante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch (periodo.getText()){
                    case "1":
                    case "2":
                        if (tempoTecnicoVisitante.getText() == "0") tempoTecnicoVisitante.setText("T");
                        else if (tempoTecnicoVisitante.getText() == "T") tempoTecnicoVisitante.setText("TT");
                        else tempoTecnicoVisitante.setText("0");
                    break;
                    case "3":
                    case "4":
                    case "OT":
                        if (tempoTecnicoVisitante.getText() == "0") tempoTecnicoVisitante.setText("T");
                        else if (tempoTecnicoVisitante.getText() == "T") tempoTecnicoVisitante.setText("TT");
                        else if (tempoTecnicoVisitante.getText() == "TT") tempoTecnicoVisitante.setText("TTT");
                        else tempoTecnicoVisitante.setText("0");
                    break;
                }
            }
        });
    }
}
