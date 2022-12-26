import javax.swing.JOptionPane;

public class Ex29_MaiorQ30 {
    public static void main(String[] args) {
        float n;
        int m = 0;
        String s = "";
        for(int i = 1; i <= 15; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número:"));
            if(n > 30){
                s += n + "   ";
                m = m + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Foram digitados " + m + " valores maiores que 30:" + "\n" + s);
    }
}