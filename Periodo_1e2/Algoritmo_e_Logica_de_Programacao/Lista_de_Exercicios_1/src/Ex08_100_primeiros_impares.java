import javax.swing.JOptionPane;

public class Ex08_100_primeiros_impares {
    public static void main(String[] args) {
        String Imp = ""; int c = 1; int n = 1;
        while(c <= 100){
            if(n % 2 != 0){
                Imp += n + "   ";
                c++;
            }if(n % 35 == 0){
                Imp += "\n";
            }
            n++;
            }
        JOptionPane.showMessageDialog(null, Imp);
    }
}