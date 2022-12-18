import javax.swing.JOptionPane;

public class Ex19_ContadorSomaCubo {
    public static void main(String[] args) {
        String s = "";
        int sc = 0;
        for(int i = 1; i <= 100; i++){
            s += i + "   ";
            if(i % 25 == 0){
                s += "\n";
            }
            sc = (int) (sc + Math.pow(i, 3));
        }
    JOptionPane.showMessageDialog(null, s + "\nSoma do cubo dos valores :   " + sc);
    }
}