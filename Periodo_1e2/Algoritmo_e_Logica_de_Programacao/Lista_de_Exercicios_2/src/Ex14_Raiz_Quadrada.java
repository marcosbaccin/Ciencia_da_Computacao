import javax.swing.JOptionPane;

public class Ex14_Raiz_Quadrada {
    public static void main(String[] args) {
        float v[] = new float[15], n;
        String s = "";
        for(int i = 0; i < 15; i++){
            n = Float.parseFloat(JOptionPane.showInputDialog("Digite um número."));
            if(n < 0){
                v[i] = -1;
            }
            else{
                v[i] = (float) Math.sqrt(n);
            }
            s += "Raiz quadrada de " + n + " = " + v[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, s);
    }
}