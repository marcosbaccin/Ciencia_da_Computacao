import javax.swing.JOptionPane;

public class Ex38_Primo {
    public static void main(String[] args) {
        int N;
        int D = 0;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        for(int i = 1; i <= N; i++){
            if(N % i == 0){
            D = D + i;}
        }
        if(D == N + 1){
            JOptionPane.showMessageDialog(null, N + " é um número primo.");
        }else{
            JOptionPane.showMessageDialog(null, N + " não é um número primo.");
        }
    }
}