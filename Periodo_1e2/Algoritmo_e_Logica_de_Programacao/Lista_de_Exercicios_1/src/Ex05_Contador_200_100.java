import javax.swing.JOptionPane;

public class Ex05_Contador_200_100 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 200; i >= 100; i--){
            s += i + "   ";
            if(i % 25 == 0 && i != 200){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}