import javax.swing.JOptionPane;

public class Ex13_Cubo {
    public static void main(String[] args) {
        float n; String s = "";
        for(int i = 1; i <= 10; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            s += "(" + n + ")³  =   " + Math.pow(n, 3) + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}