package swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame{
    JLabel label = new JLabel("texto tal", JLabel.RIGHT);
    private JButton btLogar,btCancelar;
    private JLabel lbLogin, lbSenha;
    private JTextField tfLogin;
    private JPasswordField pfSenha;
    private static Login frame;
    public Login(){
        incializarComponentes();
        definirEventos();
    }
    private void incializarComponentes(){
        setTitle("Login");
        setBounds(0, 0, 300, 200);
        setLayout(null);
        btLogar = new JButton("Logar");
        btCancelar = new JButton("Cancelar");
        lbLogin = new JLabel("Login: ");
        lbLogin.setToolTipText("Digite seu nome aqui de usuario aqui.");
        lbSenha = new JLabel("Senha: ");
        tfLogin = new JTextField(5);
        pfSenha = new JPasswordField(5);
        btLogar.setBounds(180, 30, 80, 25);
        btCancelar.setBounds(180, 75, 80, 30);
        lbLogin.setBounds(10, 30, 60, 30);
        lbSenha.setBounds(10, 75, 60, 25);
        tfLogin.setBounds(70, 30, 100, 30);
        pfSenha.setBounds(70, 75, 100, 25);
        add(btCancelar);
        add(btLogar);
        add(pfSenha);
        add(tfLogin);
        add(lbLogin);
        add(lbSenha);
    }

    private void definirEventos(){
        btLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = String.valueOf(pfSenha.getPassword());
                if (tfLogin.getText().equals("usuario") && senha.equals("senha")){
                    frame.setVisible(false);
                    MenuMain.abrir();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorreto");
                }
            }
        });
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "erro: " + e.toString());
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Login();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2 );
                frame.setVisible(true);
            }
        });
    }
}
