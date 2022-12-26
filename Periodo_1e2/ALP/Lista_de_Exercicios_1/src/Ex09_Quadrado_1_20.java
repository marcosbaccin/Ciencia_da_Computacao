import javax.swing.JOptionPane;

public class Ex09_Quadrado_1_20 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 1; i <= 20; i++){
            s += "(" + i + ")² = " + Math.pow(i, 2) + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
     }
}