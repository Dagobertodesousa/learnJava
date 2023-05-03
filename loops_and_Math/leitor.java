package loops_and_Math;

import javax.swing.JOptionPane;

class leitor {
    String
        texto = " Exemplo 4.10 demonstra o uso dos métodos toUpperCase e toLowerCase e dispensa maiores detalhes, dada a simplicidade dessas duas funções. A única observação se refere ao fato de que esses métodos não alteram o valor original da string. Mesmo aplicando os métodos das linhas 8 e 9, o conteúdo das variáveis permanece o mesmo, isto é, a transformação ocorre apenas com fins de impressão em tela. Se for necessário alterar o conteúdo de uma variável string, substituindo seu valor original pelo transformado, a própria variável d",
        searching = "";
    // exporta a variavel txt
    public String txT(){
            String txt = JOptionPane.showInputDialog(null, "Digite o que deseja pesquisar: ", "Trecho ou palavra", JOptionPane.PLAIN_MESSAGE);
            return txt;
    }
    // faz a leitura do texto caractere a caractere
    public void CHARAT(){
        String reader = txT();
        for (int i = 0; i <= texto.length(); i++){
            for (int j = 0; j <= reader.length(); j++){
                if (reader.charAt(j) == texto.charAt(i)){
                    searching = searching + texto.charAt(i);
                } else
                if (reader.charAt(j) != texto.charAt(i)){
                    searching = "";
                    break;
                }
                else {
                    System.out.println("other");
                }
                break;
            }
        }
    }
    // transforma a frase escolhida totalmente em maiusculo
    public void TO_UPPER(){
        String reader = txT();
        JOptionPane.showMessageDialog(null, reader.toUpperCase(), "maiusculo", 0);
    }
    // transforma a frase escolhida totalmente em minusculo
    public void TO_LOWER(){
        String reader = txT();
        JOptionPane.showMessageDialog(null, reader.toLowerCase(), "minusculo", 0);
    }
    // resgata um intervalo da frase de acordo com os espaços delimitados
    public void SUBSTRING(){
        String reader = txT();
        JOptionPane.showMessageDialog(null, reader.substring(4,10), "Parte da Celular", 0);
    }
    // remove espaços em branco no inicio da frase e ao final da frase
    public void TRIM(){
        String reader = txT();
        JOptionPane.showMessageDialog(null, reader.trim(), "remove espaço em branco de inicio e fim", 0);
    }
    // substitui os caracteres de uma frase por outro
    public void REPLACE(){
        String
            obs = JOptionPane.showInputDialog(null, "qual caratere deseja observar para troca no texto:\n" + texto, "charactere observado", 0),
            repl = JOptionPane.showInputDialog(null, "caratere a ser aplicado: ", "charactere alterado", 0);

        JOptionPane.showMessageDialog(null, texto.replace(obs, repl), "character alterado", 0);
    }
    // transforma a variável escolhida em string
    public void VALUE_OF(){
        double reader = Double.parseDouble(txT());
        JOptionPane.showMessageDialog(null, String.valueOf(reader), "transformando em string", 0);
    }
    // retorna a posição inicial de uma palavra dentro de uma frase
    public void INDEX_OF(){
        String
            reader = txT(),
            encontrado;
        encontrado = (texto.indexOf(reader) == (-1)) ? "não encontrado" : "texto encontrado a partir da linha: " + texto.indexOf(reader);
        JOptionPane.showMessageDialog(null, encontrado, "Procura a palavra ###### dentro da frase", 0);
    }
}