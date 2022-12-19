import javax.swing.JOptionPane;

public class Ex13_Cubo {
    public static void main(String[] args) {
        float v[] = new float[10], n;
        String s = "";
        for(int i = 0; i < 10; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número."));
            v[i] = (float) Math.pow(n, 3);
            s += "(" + n + ")³ = " + v[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}