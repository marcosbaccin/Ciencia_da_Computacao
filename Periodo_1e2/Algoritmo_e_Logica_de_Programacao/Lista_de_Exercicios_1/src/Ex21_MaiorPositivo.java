import javax.swing.JOptionPane;

public class Ex21_MaiorPositivo {
    public static void main(String[] args) {
        int NUM;
        int maior = 0;
        int n;
        do{
            NUM = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão lidos?"));
            if(NUM <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um número inteiro maior que 0.");
            }
        }while(NUM <= 0);
        for(int i = 1; i <= NUM; i++){
            do{
                n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° valor:"));
                if(n <= 0){
                    JOptionPane.showMessageDialog(null, "Digite um número inteiro maior que 0.");
                }
            }while(n <= 0);
                if(n > maior){
                    maior = n;
                }
        }
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi :  " + maior);
    }
}