package swing;

import java.awt.event.*;
import javax.swing.*;

public class Radio extends JPanel{
    private JLabel sexo;
    private JButton botaoVerificar;
    private JRadioButton masculino, feminino, transMasculino, transFeminino, semGenero;
    private ButtonGroup botaoGrupo;

    public Radio(){
        incializarComponentes();
        definirEventos();
    }

    private void incializarComponentes(){
        setLayout(null);
        sexo = new JLabel("Gênero");
        botaoVerificar = new JButton("Verificar");
        masculino = new JRadioButton("masculino");
        transMasculino = new JRadioButton("Homem Trans");
        feminino = new JRadioButton("feminino");
        transFeminino = new JRadioButton("Mulher Trans");
        semGenero = new JRadioButton("Não possue gênero");
        botaoGrupo = new ButtonGroup();
        botaoGrupo.add(semGenero);
        botaoGrupo.add(masculino);
        botaoGrupo.add(feminino);
        botaoGrupo.add(transFeminino);
        botaoGrupo.add(transMasculino);
        botaoVerificar.setBounds(200, 35, 125, 125);
        sexo.setBounds(55, 10, 105, 30);
        masculino.setBounds(55, 35, 100, 25);
        feminino.setBounds(55, 60, 100, 25);
        transMasculino.setBounds(55, 85, 100, 25);
        transFeminino.setBounds(55, 110, 100, 25);
        semGenero.setBounds(55, 135, 100, 25);
        add(botaoVerificar);
        add(sexo);
        add(semGenero);
        add(masculino);
        add(feminino);
        add(transFeminino);
        add(transMasculino);
    }
    private void definirEventos(){
        botaoVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                if (masculino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Masculino Selecionado");
                } else
                if (feminino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Feminino Selecionado");
                } else
                if (transMasculino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Homem Trans Selecionado");
                } else
                if (transFeminino.isSelected()){
                    JOptionPane.showMessageDialog(null, "Mulher Trans Selecionado");
                } else
                if (semGenero.isSelected()){
                    JOptionPane.showMessageDialog(null, "Sem Gênero Selecionado");
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhuma opção Selecionado");
                }
            }
        });
    }
}
