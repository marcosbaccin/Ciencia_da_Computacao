import javax.swing.JOptionPane;

public class Ex23_Menor {
    public static void main(String[] args) {
        int NUM;
        int menor = Integer.MAX_VALUE;
        int n;
        do{
            NUM = Integer.parseInt(JOptionPane.showInputDialog("Quantos números serão lidos?"));
            if(NUM <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!" + "\nDigite um número inteiro maior que 0.");
            }
        }while(NUM <= 0);
        for(int i = 1; i <= NUM; i ++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° valor:"));
            if(n < menor){
                menor = n;
            }
        }
        JOptionPane.showMessageDialog(null, "O menor valor digitado foi :  " + menor);
    }
}