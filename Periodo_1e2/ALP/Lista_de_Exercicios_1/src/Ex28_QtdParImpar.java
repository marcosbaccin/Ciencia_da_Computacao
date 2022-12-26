import javax.swing.JOptionPane;

public class Ex28_QtdParImpar {
    public static void main(String[] args) {
        int n;
        int par = 0;
        int imp = 0;
        String P = "";
        String I = "";
        for(int i = 1; i <= 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if(n % 2 == 0){
                par = par + 1;
                P += n + "  ";
            }else{
                imp = imp + 1;
                I += n + "  ";
            }
        }
        JOptionPane.showMessageDialog(null, par + " valores pares digitados:" + "\n" + P + "\n" + imp + " valores ímpares digitados:" + "\n" + I);
    }
}