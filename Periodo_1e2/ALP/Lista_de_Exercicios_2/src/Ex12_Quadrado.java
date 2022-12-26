import javax.swing.JOptionPane;

public class Ex12_Quadrado {
    public static void main(String[] args) {
        float v[] = new float[10], n;
        String s = "";
        for(int i = 0; i < 10; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número."));
            v[i] = (float) Math.pow(n, 2);
            s += "(" + n + ")² : " + v[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}