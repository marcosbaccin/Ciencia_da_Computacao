import javax.swing.JOptionPane;

public class Ex39_MenoresPrimos {
    public static void main(String[] args) {
        int N;
        String s = "";
        do{
            N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
            if(N <= 0){
                JOptionPane.showMessageDialog(null, "Digite um valor maior que 0.");
            }
        }while(N <= 0);
        int P = 0; int Cont = 1;
        while(P < N){
            int SD = 0;
            for(int i = 1; i <= Cont; i++){
                if(Cont % i == 0){
                    SD = SD + i;
                }if(SD == Cont + 1){
                    s += Cont + "   ";
                    P = P + 1;
                }
            }
            Cont++;
        }
       JOptionPane.showMessageDialog(null, N + " menores primos  :" + "\n" + s);
    }
}