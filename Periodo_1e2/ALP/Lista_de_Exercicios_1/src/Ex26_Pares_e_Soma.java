import javax.swing.JOptionPane;

public class Ex26_Pares_e_Soma {
    public static void main(String[] args) {
        int Li, Lf;
        String s = "";
        int soma = 0;
        do{
            Li = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial do intervalo (aberto):"));
            if(Li <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro maior que 0.");
            }
        }while(Li <= 0);
        do{
            Lf = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do intervalo (aberto):"));
            if(Lf <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro maior que 0.");
            }if(Lf <= Li){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "Digite um valor inteiro maior que " + Li);
            }
        }while(Lf <= 0 || Lf <= Li);
        for(int i = Li; i < Lf; i++){
            if(i % 2 == 0 && i != Li){
                s += i + "   ";
                soma = soma + i;
                if(i % 20 == 0){
                    s += "\n";
                }
            }    
        }
        JOptionPane.showMessageDialog(null, "Pares do intervalo aberto de " + Li + " até " + Lf + " :" + "\n" + s + "\nSoma dos pares: " + soma);
    }
}