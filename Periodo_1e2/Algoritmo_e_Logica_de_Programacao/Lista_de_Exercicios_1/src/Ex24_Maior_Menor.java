import javax.swing.JOptionPane;

public class Ex24_Maior_Menor {
    public static void main(String[] args) {
        int n;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for(int i = 1; i <= 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° valor:"));
            if(n > maior){
                maior = n;
            }if(n < menor){
                menor = n;
            }
        }
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi :  " + maior + "\nO menor valor digitado foi :  " + menor);
    }
}