import javax.swing.JOptionPane;

public class Ex11_Metade {
    public static void main(String[] args) {
        float n; String s = "";
        for(int i = 1; i <= 10; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            s += "Metade de " + n + "  :   " + n/2 + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}