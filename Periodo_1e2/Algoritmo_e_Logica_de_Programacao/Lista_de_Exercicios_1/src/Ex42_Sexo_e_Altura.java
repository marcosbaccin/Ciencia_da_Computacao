import javax.swing.JOptionPane;

public class Ex42_Sexo_e_Altura {
    public static void main(String[] args) {
        int MF;
        float Alt;
        float Menor = Float.MAX_VALUE;
        float Maior = Float.MIN_VALUE;
        int F = 0;
        float MFem = 0;
        float Média = 0; 
        for(int i = 1; i <= 10; i++){
            do{
                MF = Integer.parseInt(JOptionPane.showInputDialog("Informe seu sexo:" + "\n1)Masculino" + "\n2)Feminino"));
                if(MF <= 0 || MF >= 3){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "Digite (1) para masculino ou (2) para feminino.");
                }if(MF == 2){
                    F = F + 1;
                }
            }while(MF <= 0 || MF >= 3);
            do{
                Alt = Float.parseFloat(JOptionPane.showInputDialog("Qual a sua altura?"));
                if(Alt <= 0){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "Digite um valor maior que zero.");
                }if(Alt < Menor){
                    Menor = Alt;
                }if(Alt > Maior){
                    Maior = Alt;
                }if(MF == 2){
                    MFem = MFem + Alt;
                }
                Média = Média + Alt;
            }while(Alt <= 0);
        }
        MFem = MFem / F;
        Média = Média / 10;
        JOptionPane.showMessageDialog(null, "Maior altura:  " + Maior + "m" + "\nMenor altura:  " + Menor + "m" + "\nMédia de altura das mulheres:  " + MFem + "m" + "\nMédia de altura da turma:  " + Média + "m");
    }
}