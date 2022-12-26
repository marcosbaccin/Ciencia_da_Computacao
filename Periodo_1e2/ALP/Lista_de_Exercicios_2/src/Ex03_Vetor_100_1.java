import javax.swing.JOptionPane;

public class Ex03_Vetor_100_1 {
    public static void main(String[] args) {
        int v[] = new int[100];
        String s = "";
        for(int i = 99; i >= 0; i--){
            v[i] = i + 1;
            s += v[i] + " ";
            if(v[i] % 25 == 0 && v[i] != 100){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}