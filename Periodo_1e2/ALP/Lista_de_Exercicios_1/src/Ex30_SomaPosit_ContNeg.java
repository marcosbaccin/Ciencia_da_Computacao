import javax.swing.JOptionPane;

public class Ex30_SomaPosit_ContNeg {
    public static void main(String[] args) {
        float NUM;
        float soma = 0;
        int n = 0;
        String Neg = "";
        for(int i = 1; i <= 10; i++){
            NUM = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            if(NUM > 0){
                soma = soma + NUM;
            }if(NUM < 0){
                Neg += "(" + NUM + ")   ";
                n = n + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Soma dos valores positivos :  " + soma + "\nForam digitados " + n + " valores negativos:" + "\n" + Neg);
    }
}