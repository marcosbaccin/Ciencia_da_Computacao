import javax.swing.JOptionPane;

public class Ex02_Contador_1_100 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 1; i <= 100; i++){
            s += i + "   ";
            if(i % 25 == 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}