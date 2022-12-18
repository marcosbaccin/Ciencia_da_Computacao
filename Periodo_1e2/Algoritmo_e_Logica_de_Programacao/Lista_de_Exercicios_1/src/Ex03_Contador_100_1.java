import javax.swing.JOptionPane;

public class Ex03_Contador_100_1 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 100; i >= 1; i--){
            s += i + "   ";
            if(i % 25 == 0 && i != 100){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}