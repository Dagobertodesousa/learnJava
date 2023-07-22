package swing;
import geometria.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MenuMain extends JFrame{
    private JDesktopPane content;
    private JMenuBar menu;
    private JMenu Arquivo, Exibir, Mostrar, Mais;
    private JMenuItem
        Salvar, Exportar, Sair,
        mostrarPor, Tamanho, Opcao,
        Unique, Dual, quadro, seletorBandeira,
        Scroll, ProgressBar, flowL, gridL, abas,
        frameI, tabuleiro, grade;
    private ImageIcon mono;
    
    public MenuMain(){
        incializarComponentes();
        definirEventos();
    }
    
    private void incializarComponentes(){
        setTitle("Login");
        setBounds(0, 0, 800, 600);
        setBackground(Color.DARK_GRAY);
        content = new JDesktopPane();
        setContentPane(content);
        mono = new ImageIcon("swing/image/mn.png");
        menu = new JMenuBar();
        Arquivo = new JMenu("Arquivo");
        Arquivo.setMnemonic('A');
        Exibir = new JMenu("Exibir");
        Exibir.setMnemonic('E');
        Mostrar = new JMenu("Mostrar");
        Mostrar.setMnemonic('M');
        Mais = new JMenu("Mais");
        Mais.setMnemonic('I');
        Salvar = new JMenuItem("Salvar", 5);
        Exportar = new JMenuItem("Exportar");
        Exportar.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_X, ActionEvent.SHIFT_MASK)
        );
        mostrarPor = new JMenuItem("Mostrar Por...");
        Tamanho = new JMenuItem("Tamanho", 1);
        Sair = new JMenuItem("Sair");
        Sair.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_S, ActionEvent.ALT_MASK
            )
        );
        Opcao = new JMenuItem("Opções");
        Unique = new JMenuItem("Único");
        quadro = new JMenuItem("Quadro");
        quadro.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_Q, ActionEvent.SHIFT_MASK
            )
        );
        seletorBandeira = new JMenuItem("Bandeira");
        seletorBandeira.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_B, ActionEvent.SHIFT_MASK
            )
        );
        Scroll = new JMenuItem("Scroller Length");
        Scroll.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_SPACE, ActionEvent.SHIFT_MASK
            )
        );
        ProgressBar = new JMenuItem("Barra de Progresso", (new ImageIcon("swing/progress/a-d.png")));
        ProgressBar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.ALT_MASK));
        flowL = new JMenuItem("Flow Button");
        gridL = new JMenuItem("Grid Button");
        abas = new JMenuItem("Abas");
        abas.setAccelerator(
            KeyStroke.getKeyStroke(
                KeyEvent.VK_A, ActionEvent.ALT_MASK
            )
        );
        Dual = new JMenuItem("Duplo", mono);
        frameI = new JMenuItem("Frame Interno");
        frameI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK));
        tabuleiro = new JMenuItem("Tabuleiro");
        tabuleiro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.SHIFT_MASK));
        grade = new JMenuItem("Grade");
        grade.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.SHIFT_MASK));
        Arquivo.add(Salvar);
        Arquivo.add(Exportar);
        Arquivo.add(Sair);
        Exibir.add(mostrarPor);
        Exibir.add(Tamanho);
        Exibir.add(Opcao);
        Mostrar.add(Unique);
        Mostrar.add(Dual);
        Mostrar.add(quadro);
        Mostrar.add(seletorBandeira);
        Mais.add(Scroll);
        Mais.add(ProgressBar);
        Mais.add(flowL);
        Mais.add(gridL);
        Mais.add(abas);
        Mais.add(frameI);
        Mais.add(tabuleiro);
        Mais.add(grade);
        menu.add(Arquivo);
        menu.add(Exibir);
        menu.add(Mostrar);
        menu.add(Mais);
        setJMenuBar(menu);
    }

    private void definirEventos(){
        Salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TextArea texto = new TextArea();
                content.removeAll();
                content.add(texto);
                content.validate();
            }
        });
        Exportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Radio radio = new Radio();
                content.removeAll();
                content.add(radio);
                content.validate();
            }
        });
        mostrarPor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ListaFotos fotos = new ListaFotos();
                content.removeAll();
                content.add(fotos);
                content.validate();
            }
        });
        Tamanho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calcgeom geom = new calcgeom();
                content.removeAll();
                geom.seletorFigura();
                content.validate();
            }
        });
        Opcao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                MenuOpcao menuOpcao = new MenuOpcao();
                content.removeAll();
                content.add(menuOpcao);
                content.validate();
            }
        });
        Sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Unique.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Lista lista = new Lista();
                content.removeAll();
                content.add(lista);
                content.validate();
            }
        });
        Dual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Rotulo rotulo = new Rotulo();
                content.removeAll();
                content.add(rotulo);
                content.validate();
            }
        });
        quadro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                casa home = new casa();
                content.removeAll();
                home.seletorFigura();
                content.validate();
            }
        });
        seletorBandeira.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                BandeiraEstado seletor = new BandeiraEstado();
                content.removeAll();
                content.add(seletor);
                content.validate();
            }
        });
        Scroll.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Scroll scroll = new Scroll();
                content.removeAll();
                content.add(scroll);
                content.validate();
            }
        });
        ProgressBar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Progress progressBar = new Progress();
                content.removeAll();
                content.add(progressBar);
                content.validate();
            }
        });
        flowL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Flow_Layout fl = new Flow_Layout();
                content.removeAll();
                content.add(fl);
                content.validate();
            }
        });
        gridL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                Grid_Layout gl = new Grid_Layout();
                content.removeAll();
                content.add(gl);
                content.validate();
            }
        });
        abas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                AbasFrame Abas = new AbasFrame();
                content.removeAll();
                content.add(Abas);
                content.validate();
            }
        });
        frameI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JanelaInterna janela = new JanelaInterna();
                content.removeAll();
                content.add(janela);
                content.validate();
            }
        });
        tabuleiro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Tabuleiro jogoTabuleiro = new Tabuleiro();
                content.removeAll();
                content.add(jogoTabuleiro);
                content.validate();
            }
        });
        grade.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Grade g = new Grade();
                content.removeAll();
                content.add(g);
                content.validate();
            }
        });
    }
    public static void abrir() {
        MenuMain frame = new MenuMain();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(
            (tela.width - frame.getSize().width) / 2,
            (tela.height - frame.getSize().height) / 2 );
        frame.setVisible(true);
    };
}