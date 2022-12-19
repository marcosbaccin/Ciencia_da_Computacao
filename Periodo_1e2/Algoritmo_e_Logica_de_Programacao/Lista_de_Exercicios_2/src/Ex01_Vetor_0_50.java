import javax.swing.JOptionPane;

public class Ex01_Vetor_0_50 {
    public static void main(String[] args) {
        int v[] = new int[51];
        String s = "";
        for(int i = 0; i < 51; i++){
            v[i] = i;
            s += v[i] + " ";
            if(v[i] % 25 == 0 && v[i] != 0){
                s += "\n";
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}