import javax.swing.JOptionPane;

public class Ex16_ContadorSoma {
    public static void main(String[] args) {
        String S = "";
        int Soma = 0;
        for(int i = 1; i <= 100; i++){
            S += i + "  ";
            if(i % 25 == 0){
                S += "\n";
            }
            Soma = Soma + i;
        }
        JOptionPane.showMessageDialog(null, S + "\nSoma de todos os valores :   " + Soma);
    }
}