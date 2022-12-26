import javax.swing.JOptionPane;

public class Ex18_ContadorSomaMetade {
    public static void main(String[] args) {
        String s = "";
        float sm = 0;
        for(int i = 1; i <= 100; i++){
            s += i + "   ";
            if(i % 25 == 0){
                s += "\n";
            }
            sm = sm + (i / 2);    
        }
    JOptionPane.showMessageDialog(null, s + "\nSoma da metade dos valores :   " + sm);
    }
}