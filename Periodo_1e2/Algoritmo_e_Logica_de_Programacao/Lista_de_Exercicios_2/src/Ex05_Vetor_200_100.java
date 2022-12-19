import javax.swing.JOptionPane;

public class Ex05_Vetor_200_100 {
    public static void main(String[] args) {
        int v[] = new int[101];
        String s = "";
        for(int i = 0; i < 101; i++){
            v[i] = 200 - i;
            s += v[i] + " ";
            if(v[i] % 25 == 0 && v[i] != 200){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}