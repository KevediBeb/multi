import javax.swing.JOptionPane;
public class multi {
    public static void main(String[] args) {
        String ask = JOptionPane.showInputDialog(null, "which muliplucationtabbill++?????");
        int tabell = Integer.parseInt(ask);

        for(int i = 0; i <= 10; i++){
            System.out.println(i + " * " + tabell + " = " + tabell * i);
        }
    }
}
