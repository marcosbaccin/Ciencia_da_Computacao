import javax.swing.JOptionPane;

public class Ex36_Fatorial {
    public static void main(String[] args) {
        int n, Cont;
        int f = 0;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        Cont = n;
        for(int i = Cont - 1; i >= 1; i--){
            f = Cont * i;
            Cont = f;
        }
        JOptionPane.showMessageDialog(null, n + " !  =  "+ f);
    }
}