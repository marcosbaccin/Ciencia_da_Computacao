import javax.swing.JOptionPane;

public class Ex09_Quadrado_dos_Impares {
    public static void main(String[] args) {
        int qtd = 0;
        for(int i = 0; i < 20; i++){
            if(i % 2 != 0){
                qtd++;
            }
        }
        int v[] = new int[qtd], cont = 0;
        String s = "";
        for(int i = 0; i < 20; i++){
            if(i % 2 != 0){
                v[cont] = (int) Math.pow(i, 2);
                s += "(" + i + ")² : " + v[cont] + "\n";
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }
}