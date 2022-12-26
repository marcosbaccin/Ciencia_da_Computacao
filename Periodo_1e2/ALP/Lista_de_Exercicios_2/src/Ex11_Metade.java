import javax.swing.JOptionPane;

public class Ex11_Metade {
    public static void main(String[] args) {
        float v[] = new float[10], n;
        String s = "";
        for(int i = 0; i < 10; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número."));
            v[i] = n / 2;
            s += n + " / 2 = " + v[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}