import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex25_Dois_Maiores {
    public static void main(String[] args) {
        int A[] = new int[10];
        for(int i = 0; i < 10; i++){
            A[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor:"));
        }
        Arrays.sort(A);
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi :  " + A[9] + "\nO segundo maior valor foi :  " + A[8]);
    }
}