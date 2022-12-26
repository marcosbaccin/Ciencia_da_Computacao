import javax.swing.JOptionPane;

public class Ex16_Pares_Impares {
    public static void main(String[] args) {
        int v[] = new int[10], n;
        float mp = 0;
        float mi = 0;
        int par = 0;
        int impar = 0;
        int maiorP = Integer.MIN_VALUE;
        int menorI = Integer.MAX_VALUE;
        String p = "";
        String imp = "";
        for(int i = 0; i < 10; i++){
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número."));
            if(n % 2 == 0){
                mp = mp + n;
                par = par + 1;
                if(n > maiorP){
                    maiorP = n;
                }
            }
            if(n % 2 != 0){
                mi = mi + n;
                impar = impar + 1;
                if(n < menorI){
                    menorI = n;
                }
            }
            v[i] = n;
        }
        mp = mp / par;
        mi = mi / impar;
        for(int j = 0; j < 10; j++){
            if(v[j] % 2 == 0){
                if(v[j] > mp){
                    p += "  " + v[j] + "  "; 
                }
            }
            if(v[j] % 2 != 0){
                if(v[j] < mi){
                    imp += "  " + v[j] + "  ";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Média de pares : " + mp + "\nMédia de ímpares : " + mi + "\nMaior par : " + maiorP + "\nMenor ímpar : " + menorI + "\nPares acima da média : " + "\n" + p + "\nÍmpares abaixo da média : " + "\n" + imp);
    }
}