import javax.swing.JOptionPane;

public class Ex40_MDC {
    public static void main(String[] args) {
        int A, B;
        int MDC = 0;
        do{
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (positivo):"));
            if(A < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor positivo.");
            }
        }while(A < 0);
        do{
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (positivo):"));
            if(B < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor positivo.");
            }
        }while(B < 0);
        if(A >= B){
            for(int i = 1; i <= A; i++){
                if(A % i == 0 && B % i == 0){
                    MDC = i;
                }
            }
        }else{
            for(int i = 1; i <= B; i++){
                if(B % i == 0 && A % i == 0){
                    MDC = i;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "M.D.C. de " + A + " e " + B + " :  " + MDC);
    }
}