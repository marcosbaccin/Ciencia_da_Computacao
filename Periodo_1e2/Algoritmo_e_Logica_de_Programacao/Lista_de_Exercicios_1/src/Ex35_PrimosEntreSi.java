import javax.swing.JOptionPane;

public class Ex35_PrimosEntreSi {
    public static void main(String[] args) {
        int A, B;
        int DMC = 0;
        do{
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (positivo):"));
            if(A < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro positivo.");
            }
        }while(A < 0);
        do{
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (positivo):"));
            if(B < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro positivo.");
            }
        }while(B < 0);
        if(A >= B){
            for(int i = 1; i <= A; i++){
                if(A % i == 0 && B % i == 0){
                    DMC = i;
                }
            }
        }else{
            for(int i = 1; i <= B; i++){
                if(B % i == 0 && A % i == 0){
                    DMC = i;
                }
            }
        }
        if(DMC == 1){
            JOptionPane.showMessageDialog(null, A + " e " + B + " são primos entre si.");
        }else{
            JOptionPane.showMessageDialog(null, A + " e " + B + " não são primos entre si.");
        }
    }
}