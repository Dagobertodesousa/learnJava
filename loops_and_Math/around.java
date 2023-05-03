package loops_and_Math;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class around {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat(), inT = new DecimalFormat();
        df.applyPattern("#0.###");
        inT.applyPattern("0");
        JOptionPane.showMessageDialog(null, "arredondar PI usando ceil: "
        + inT.format(Math.ceil(Math.PI)) + "\narredondar PI usando floor: "
        + inT.format(Math.floor(Math.PI)) + "\narredondar PI usando round: "
        + inT.format(Math.round(Math.PI)) + "\nvalor de PI: "
        + df.format(Math.PI) + "\nvalor de E: "
        + df.format(Math.E), "teste envolvendo PI" + "\n", 0, null);
        
        JOptionPane.showMessageDialog(null, "arredondar E usando ceil: "
        + (int) Math.ceil(Math.E) + "\narredondar E usando floor: "
        + (int) Math.floor(Math.E) + "\narredondar E usando round: "
        + (int) Math.round(Math.E) + "\nvalor de PI: "
        + Math.PI + "\nvalor de E: "
        + Math.E, "teste envolvendo E", 0, null);

        System.exit(0);
    }
}
