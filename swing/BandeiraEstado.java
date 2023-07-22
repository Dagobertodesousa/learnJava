package swing;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class BandeiraEstado extends JPanel{
    private JLabel estados;
    private JScrollPane rolagem;
    private JComboBox<String> caixaEstados;
    private ImageIcon bandeiraEstado;
    private JButton botaoValida;

    public BandeiraEstado(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        setBackground(new Color(50, 50, 50));
        String[] caixaEstadosItems = {
            "Acre","Alagoas","Amazonas","Amapá",
            "Bahia","Ceará","DF","Espirito Santo",
            "Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul",
            "Minas Gerais","Pará","Paraná","Paraíba",
            "Pernambuco","Piauí","Rio de janeiro","Rio grande do Norte",
            "Rio Grande do Sul","Rondônia","Roraima","Santa Catarina",
            "Sergipe","São Paulo","Tocantins"
        };
        caixaEstados = new JComboBox<String>(caixaEstadosItems);
        rolagem = new JScrollPane(caixaEstados);
        rolagem.setBounds(20, 20, 180, 30);
        bandeiraEstado = new ImageIcon();
        estados = new JLabel(bandeiraEstado);
        estados.setBounds(210, 20, 800, 600);
        botaoValida = new JButton("Encerrar");
        botaoValida.setMnemonic('Q');
        botaoValida.setBounds(450, 700, 100, 30);
        add(rolagem);
        add(botaoValida);
        add(estados);
    }

    private void definirEventos(){
        caixaEstados.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                bandeiraEstado = new ImageIcon("swing/bandeiraDistrito/"+ caixaEstados.getSelectedItem().toString().toLowerCase() + ".png");
                estados.setIcon(bandeiraEstado);
            }
        });
        botaoValida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}