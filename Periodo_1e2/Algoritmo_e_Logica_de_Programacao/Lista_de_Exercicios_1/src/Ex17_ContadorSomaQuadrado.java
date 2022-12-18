import javax.swing.JOptionPane;

public class Ex17_ContadorSomaQuadrado {
    public static void main(String[] args) {
        String S = "";
        int SQ = 0;
        for(int i = 1; i <= 100; i++){
            S += i + "   ";
            if(i % 25 == 0){
                S += "\n";
            }
            SQ = (int) (SQ + Math.pow(i, 2));
        }
        JOptionPane.showMessageDialog(null, S + "\nSoma do quadrado dos valores :   " + SQ);
    }
}