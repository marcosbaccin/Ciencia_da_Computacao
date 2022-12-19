import javax.swing.JOptionPane;

public class Ex06_Multiplos_de_5 {
    public static void main(String[] args) {
        int m5 = 0;
        for(int i = 1; i <= 500; i++){
            if(i % 5 == 0){
                m5 = m5 + 1;
            }
        }
        int v[] = new int[m5];
        int p = 0; 
        String s = "";
        for(int j = 1; j <= 500; j++){
            if(j % 5 == 0){
                v[p] = j;
                s += v[p] + " ";
                p++;
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}