import javax.swing.JOptionPane;

public class Ex20_ContadorMedia {
    public static void main(String[] args) {
        String s = "";
        float m = 0;
        for(int i = 1; i <= 100; i++){
            s += i + "   ";
            if(i % 25 == 0){
                s += "\n";
            }
            m = m + i;
        }
        m = m / 100;
        JOptionPane.showMessageDialog(null, s + "\nMédia de todos os valores :   " + m);
    }
}