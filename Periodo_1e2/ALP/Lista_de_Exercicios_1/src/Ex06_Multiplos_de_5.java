import javax.swing.JOptionPane;

public class Ex06_Multiplos_de_5 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 1; i <= 500; i++){
            if(i % 5 == 0){
                s += i + "   ";}
            if(i % 100 == 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}