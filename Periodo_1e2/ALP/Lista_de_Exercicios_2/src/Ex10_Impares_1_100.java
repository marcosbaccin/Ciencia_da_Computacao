import javax.swing.JOptionPane;

public class Ex10_Impares_1_100 {
    public static void main(String[] args) {
        int imp = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                imp = imp + 1;
            }
        }
        int v[] = new int[imp], p = 0;
        String s = "";
        for(int j = 1; j <= 100; j++){
            if(j % 2 != 0){
                v[p] = j;
                s += v[p] + " ";
                p++;
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}