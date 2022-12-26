import javax.swing.JOptionPane;

public class Ex31_Produto {
    public static void main(String[] args) {
        int A;
        float B;
        float p = 0;
        B = Float.parseFloat(JOptionPane.showInputDialog("Digite um número (real):"));
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (inteiro):"));
        for(int i = 1; i <= A; i++){
            p = p + B;
        }
        JOptionPane.showMessageDialog(null, "O produto dos valores digitados é :  " + p);
    }
}