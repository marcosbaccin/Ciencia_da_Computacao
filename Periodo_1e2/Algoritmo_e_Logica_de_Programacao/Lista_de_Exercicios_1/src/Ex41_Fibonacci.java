import javax.swing.JOptionPane;

public class Ex41_Fibonacci {
    public static void main(String[] args) {
        int N;
        int Pri = 0;
        int Seg = 1;
        int Ter = 1;
        String s = "";
        do{
            N = Integer.parseInt(JOptionPane.showInputDialog("Quantos termos da sequência de Fibonacci você deseja?"));
            if(N <= 0){
            JOptionPane.showMessageDialog(null, "Digite um valor maior que zero.");
            }
        }while(N <= 0);
        s += Ter + "   ";
        for(int i = 1; i < N; i++){
            Ter = Pri + Seg;
            s += Ter + "   ";
            Pri = Seg;
            Seg = Ter;
        }
        JOptionPane.showMessageDialog(null, s);
    }
}