package swing;

import java.awt.*;
import javax.swing.*;;
public class JanelaInterna extends JInternalFrame{
    public JanelaInterna(){
        inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        setTitle("Vamos testar frame interno");
        setSize(480, 320);
        setResizable(true);
        setClosable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.GREEN);
        setVisible(true);
    }
}
