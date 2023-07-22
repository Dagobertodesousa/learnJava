package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuOpcao extends JPanel{
    private JButton botaoVerificar, botaoMarcar, botaoDesmarcar;
    private JCheckBox opcaoIngles, opcaoInformatica, opcaoMecanica;

    public MenuOpcao(){
        inicializarComponentes();
        definirEventos();
    }

    public void inicializarComponentes(){
        botaoVerificar = new JButton("Verify!");
        botaoMarcar = new JButton("Checked!");
        botaoDesmarcar = new JButton("Unchecked!");
        opcaoIngles = new JCheckBox("English");
        opcaoInformatica = new JCheckBox("Info");
        opcaoMecanica = new JCheckBox("Mech");
        setLayout(null);

        add(botaoVerificar); 
        add(botaoMarcar); 
        add(botaoDesmarcar);
        add(opcaoIngles);
        add(opcaoInformatica);
        add(opcaoMecanica);

        botaoVerificar.setBounds(250, 70, 100, 80);
        botaoMarcar.setBounds(150, 70, 100, 40);
        botaoDesmarcar.setBounds(150, 110, 100, 40);
        opcaoIngles.setBounds(15, 70, 100, 25);
        opcaoInformatica.setBounds(15, 100, 100, 25);
        opcaoMecanica.setBounds(15, 130, 100, 25);
    }
    
    private void definirEventos(){
        botaoVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String selected = "Selecionados: ";
                if (opcaoIngles.isSelected()){
                    selected += "\nIngles";
                }
                if (opcaoInformatica.isSelected()){
                    selected += "\nInformatica";
                }
                if (opcaoMecanica.isSelected()){
                    selected += "\nMecanica";
                }
                JOptionPane.showMessageDialog(null, selected);
                System.exit(0);
            }
        });
        botaoMarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                opcaoIngles.setSelected(true);
                opcaoInformatica.setSelected(true);
                opcaoMecanica.setSelected(true);
            }
        });
        botaoDesmarcar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                opcaoIngles.setSelected(false);
                opcaoInformatica.setSelected(false);
                opcaoMecanica.setSelected(false);
            }
        });
    }
}