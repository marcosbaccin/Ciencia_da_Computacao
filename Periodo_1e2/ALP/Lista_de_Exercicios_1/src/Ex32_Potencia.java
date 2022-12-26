import javax.swing.JOptionPane;

public class Ex32_Potencia {
    public static void main(String[] args) {
        float A;
        int B;
        float p = 0;
        A = Float.parseFloat(JOptionPane.showInputDialog("Digite um número (real):"));
        do{
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (inteiro):"));
            if(B < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro positivo.");}
        }while(B < 0);
        if(B == 0){
            p = 1;
        }else{
            for(int i = 1; i <= B; i++){
                if(i == 1){
                    p = A;
                }if(i > 1){
                    p = p * A;
                }
            }
        }
        JOptionPane.showMessageDialog(null, A + " elevado à " + B + " é :  " + p);
    }
}