package readandwrite;

public class usaImpressora {
    public static void main(String[] args) {
        Paper papel = new Paper("paisagem", "A4", 214, 289);
        
        papel.setPagina(85);
        papel.settingsInfo("Oficio");
        System.out.println(papel.gravarPaper());

        // ----------------------------------------

        Impressora imp = Paper.ler(85);

        System.out.println(imp.getPagina());
        System.out.println(imp.gettingsInfo());
        
    }
}
