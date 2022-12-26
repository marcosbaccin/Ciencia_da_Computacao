import javax.swing.JOptionPane;

public class Ex08_100_primeiros_impares {
    public static void main(String[] args) {
        int cont = 0, imp = 0;
        while(imp <= 100){
            if(cont % 2 != 0){
                imp = imp + 1;
            }cont++;
        }
        int v[] = new int[imp], p = 0;
        String s = "";
        for(int i = 0; i <= cont; i++){
            if(i % 2 != 0){
                v[p] = i;
                s += v[p] + " ";
                p++;
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}