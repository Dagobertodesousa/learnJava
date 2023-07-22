package swing;

import javax.swing.*;
import javax.swing.text.*;
import java.awt.event.*;
public class formatar extends JPanel{
    private JLabel rotuloCPF, rotuloCNPJ, rotuloCep, rotuloRG, rotuloTel;
    private MaskFormatter maskCPF, maskCNPJ, maskCep, maskRG, maskTel;
    private JFormattedTextField formatCPF, formatCNPJ, formatCep, formatRG, formatTel;
    private JButton mostrar;

    public formatar(){
        initComponents();
        setEvent();
    }

    private void initComponents(){
        try {
            setBounds(0, 0, 200, 200);
            setLayout(null);
            rotuloRG = new JLabel("RG", JLabel.CENTER);
            rotuloRG.setBounds(20, 20, 100, 25);
            rotuloCPF = new JLabel("CPF", JLabel.CENTER);
            rotuloCPF.setBounds(20, 50, 100, 25);
            rotuloCNPJ = new JLabel("CNPJ", JLabel.CENTER);
            rotuloCNPJ.setBounds(20, 80, 100, 25);
            rotuloCep = new JLabel("Cep", JLabel.CENTER);
            rotuloCep.setBounds(20, 110, 100, 25);
            rotuloTel = new JLabel("Telefone", JLabel.CENTER);
            rotuloTel.setBounds(20, 140, 100, 25);
            maskCPF = new MaskFormatter("###.###.###-##");
            maskCNPJ = new MaskFormatter("##.###.###/####-##");
            maskCep = new MaskFormatter("##.###-###");
            maskRG = new MaskFormatter("##.###.###");
            maskTel = new MaskFormatter("(##) # ####-####");
            formatRG = new JFormattedTextField(maskRG);
            formatRG.setBounds(110, 20, 100, 25);
            formatCPF = new JFormattedTextField(maskCPF);
            formatCPF.setBounds(110, 50, 100, 25);
            formatCNPJ = new JFormattedTextField(maskCNPJ);
            formatCNPJ.setBounds(110, 80, 100, 25);
            formatCep = new JFormattedTextField(maskCep);
            formatCep.setBounds(110, 110, 100, 25);
            formatTel = new JFormattedTextField(maskTel);
            formatTel.setBounds(110, 140, 100, 25);
            mostrar = new JButton("Mostrar");
            mostrar.setBounds(80, 170, 100, 25);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "erro: " + erro.toString(), "error", JOptionPane.ERROR_MESSAGE);
        }
        add(rotuloRG);
        add(formatRG);
        add(rotuloCPF);
        add(formatCPF);
        add(rotuloCNPJ);
        add(formatCNPJ);
        add(rotuloCep);
        add(formatCep);
        add(rotuloTel);
        add(formatTel);
        add(mostrar);
    }

    private void setEvent(){
        formatRG.addFocusListener(new FocusListener(){
            public void focusLost(FocusEvent e) {
                JOptionPane.showMessageDialog(null, "lost.");
            }
            public void focusGained(FocusEvent e) {
            }
        });
        mostrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                    null,
                    formatRG.getText() == null ? null : formatRG.getText() + "\n" +
                    formatCPF.getText() == null ? null : formatCPF.getText() + "\n" +
                    formatCNPJ.getText() == null ? null : formatCNPJ.getText() + "\n" +
                    formatCep.getText() == null ? null : formatCep.getText() + "\n" +
                    formatTel.getText() == null ? null : formatTel.getText(), "Informações", JOptionPane.PLAIN_MESSAGE
                );
                JOptionPane.showMessageDialog(null, formatCPF.getText());
                String
                    cnpj = formatCNPJ.getText(),
                    cep = formatCep.getText(),
                    tel = formatTel.getText();
                cnpj.replace(",", "");
                cnpj.replace(".", "");
                cnpj.replace("/", "");
                
                cep.replace(",", "");
                cep.replace(".", "");
                cep.replace("-", "");
                
                tel.replace("-", "");
                JOptionPane.showMessageDialog(null, cnpj);
                JOptionPane.showMessageDialog(null, cep);
                JOptionPane.showMessageDialog(null, tel);
            }
        });
    }
}