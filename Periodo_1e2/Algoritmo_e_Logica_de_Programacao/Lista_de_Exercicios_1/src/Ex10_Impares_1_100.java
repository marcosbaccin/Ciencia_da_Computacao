import javax.swing.JOptionPane;

public class Ex10_Impares_1_100 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                s += i + "   ";
            }if(i % 15 == 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}