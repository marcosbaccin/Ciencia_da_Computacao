import javax.swing.JOptionPane;

public class Ex27_Multiplos_de_3_e_5 {
    public static void main(String[] args) {
        int NUM;
        String m3 = "";
        String m5 = "";
        do{
            NUM = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final do intervalo:"));
            if(NUM <= 1){
                JOptionPane.showMessageDialog(null, "Digite um valor inteiro maior que 1 !!");
            }
        }while(NUM <= 1);
        for(int i = 1; i <= NUM; i++){
            if(i % 3 == 0){
                m3 += i + "   ";
                if(i % 30 == 0){
                    m3 += "\n";
                }
            }
            if(i % 5 == 0){
                m5 += i + "   ";
                if(i % 50 == 0){
                    m5 += "\n";
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Múltiplos de 3:" + "\n" + m3 + "\nMúltiplos de 5:" + "\n" + m5);
    }
}