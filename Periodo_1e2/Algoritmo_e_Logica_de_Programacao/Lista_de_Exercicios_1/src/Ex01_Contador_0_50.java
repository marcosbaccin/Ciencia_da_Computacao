import javax.swing.JOptionPane;

public class Ex01_Contador_0_50 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 0; i <= 50; i++){
            s += i + "   ";
            if(i % 10 == 0 && i != 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}