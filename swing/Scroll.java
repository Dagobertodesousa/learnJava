package swing;

import javax.swing.*;
import java.awt.event.*;
import java.text.NumberFormat;
public class Scroll extends JPanel{
    private JScrollBar cmBar;
    private JLabel cm, furlong, jarda, milha, milhaNautica, pol, pe;
    
    public Scroll(){
        incializarComponentes();
        definirEventos();
    }
    
    private void incializarComponentes(){
        setLayout(null);
        cmBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 100, 0, 10100);
        cm = new JLabel("0.00 cm", JLabel.CENTER);
        furlong = new JLabel("0.00 fur", JLabel.CENTER);
        jarda = new JLabel("0.00 yd", JLabel.CENTER);
        milha = new JLabel("0.00 mi", JLabel.CENTER);
        milhaNautica = new JLabel("0.00 nmi", JLabel.CENTER);
        pol = new JLabel("0.00 in", JLabel.CENTER);
        pe = new JLabel("0.00 ft", JLabel.CENTER);
        cmBar.setBounds(50, 25, 750, 25);
        furlong.setBounds(50, 55, 150, 25);
        jarda.setBounds(50, 85, 150, 25);
        milha.setBounds(50, 115, 150, 25);
        pol.setBounds(50, 145, 150, 25);
        pe.setBounds(50, 175, 150, 25);
        milhaNautica.setBounds(50, 205, 150, 25);
        cm.setBounds(50, 255, 150, 25);
        add(cmBar);
        add(cm);
        add(furlong);
        add(jarda);
        add(milha);
        add(milhaNautica);
        add(pol);
        add(pe);
    }

    private void definirEventos(){
        cmBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                NumberFormat nf = NumberFormat.getNumberInstance();
                nf.setMinimumFractionDigits(3);
                nf.setMaximumFractionDigits(4);

                double furlongValor = cmBar.getValue() * (1/20116.8);
                furlong.setText(nf.format(furlongValor) + " fur");

                double jardaValor = cmBar.getValue() * (1/91.44);
                jarda.setText(nf.format(jardaValor) + " yd");
                
                double polValor = cmBar.getValue() * (1/2.54);
                pol.setText(nf.format(polValor) + " in");
                
                double milhaValor = cmBar.getValue() * (1/160934.4);
                milha.setText(nf.format(milhaValor) + " mi");
                
                double peValor = cmBar.getValue() * (1/30.48);
                pe.setText(nf.format(peValor) + " ft");
                
                double milhaNauticaValor = cmBar.getValue() * (1/185200.0);
                milhaNautica.setText(nf.format(milhaNauticaValor) + " nmi");
                
                double cmValor = cmBar.getValue();
                cm.setText(cmValor + " cm");
            }
        });
    }
}