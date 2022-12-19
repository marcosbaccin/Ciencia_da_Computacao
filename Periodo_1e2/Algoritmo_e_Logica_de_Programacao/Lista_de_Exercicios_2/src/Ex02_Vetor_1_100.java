import javax.swing.JOptionPane;

public class Ex02_Vetor_1_100 {
    public static void main(String[] args) {
        int v[] = new int[100];
        String s = "";
        for(int i = 0; i < 100; i++){
            v[i] = i + 1;
            s += v[i] + " ";
            if(v[i] % 25 == 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}