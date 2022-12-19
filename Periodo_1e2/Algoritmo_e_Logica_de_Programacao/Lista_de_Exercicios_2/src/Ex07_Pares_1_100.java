import javax.swing.JOptionPane;

public class Ex07_Pares_1_100 {
    public static void main(String[] args) {
        int par = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                par = par + 1;
            }
        }
        int v[] = new int[par];
        String s = "";
        int p = 0;
        for(int j = 1; j <= 100; j++){
            if(j % 2 == 0){
                v[p] = j;
                s += v[p] + " ";
                p++;
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}