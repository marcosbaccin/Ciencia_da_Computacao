import javax.swing.JOptionPane;

public class Ex37_Divisores {
    public static void main(String[] args) {
        int n;
        String s = "";
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                s += i + "   ";
            }
        }
        JOptionPane.showMessageDialog(null, "Divisores de " + n + " :" + "\n" + s);
    }
}