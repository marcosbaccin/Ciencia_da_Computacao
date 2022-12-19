import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex15_Sexo_Altura {
    public static void main(String[] args) {
        float a[] = new float[50];
        int s[] = new int[50];
        float alt;
        int sex;
        float MAF = 0;
        int f = 0;
        String maf = "";
        float mt = 0;
        String amt = "";
        for(int i = 0; i < 50; i++){
            do{
                sex = Integer.parseInt(JOptionPane.showInputDialog("Qual seu sexo ?" + "\n1) Masculino" + "\n2) Feminino"));
                if(sex != 1 && sex != 2){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite novamente.");
                }
            }while(sex != 1 && sex != 2);
            do{
                alt = Float.parseFloat(JOptionPane.showInputDialog("Qual é sua altura ?"));
                if(alt <= 0){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite novamente.");
                }if(sex == 2){
                    MAF = MAF + alt;
                    f = f + 1;
                }
            }while(alt <= 0);
            s[i] = sex;
            a[i] = alt;
            mt = mt + alt;
        }
        MAF = MAF / f;
        mt = mt / 50;
        for(int j = 0; j < 50; j++){
            if(s[j] == 2){
                if(a[j] > MAF){
                    maf += "   A[" + j + "] = " + a[j] + "\n";
                }
            }if(a[j] < mt){
                amt += "   A[" + j + "] = " + a[j] + "\n";
            }
        }
        Arrays.sort(a);
        JOptionPane.showMessageDialog(null, "Maior altura : " + a[49] + "\nMenor altura : " + a[0] + "\nMulheres com altura acima da média das mulheres (" + MAF + ") :" + "\n" + maf + "\nPessoas com altura abaixo da média da turma (" + mt + ") :" + "\n" + amt);
    }
}