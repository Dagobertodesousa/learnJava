package swing;

import javax.swing.*;
import javax.swing.event.*;

public class ListaFotos extends JPanel{
    private JLabel album;
    private JList<String> fotos;
    private JScrollPane rolagem;
    private DefaultListModel<String> modeloLista;
    private ImageIcon imagem;

    public ListaFotos(){
        inicializarComponentes();
        definirEventos();
    }
    private void inicializarComponentes(){
        setLayout(null);
        modeloLista = new DefaultListModel<String>();
        for (int i = 0; i <=9; i++){
            modeloLista.addElement("foto" + i);
        }
        fotos = new JList<String>(modeloLista);
        rolagem = new JScrollPane(fotos);
        rolagem.setBounds(20, 20, 60, 185);
        imagem = new ImageIcon();
        album = new JLabel(imagem);
        album.setBounds(120, 20, 800, 800);
        add(rolagem);
        add(album);
    }

    private void definirEventos(){
        fotos.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e){
                imagem = new ImageIcon("swing/image/"+ fotos.getSelectedValue() + ".png");
                album.setIcon(imagem);
            }
        });
    }
}
