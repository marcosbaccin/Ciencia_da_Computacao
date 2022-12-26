import javax.swing.JOptionPane;

public class Ex04_Vetor_100_200 {
    public static void main(String[] args) {
        int v[] = new int[101];
        String s = "";
        for(int i = 0; i < 101; i++){
            v[i] = i + 100;
            s += v[i] + " ";
            if(v[i] % 25 == 0 && v[i] != 100){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}