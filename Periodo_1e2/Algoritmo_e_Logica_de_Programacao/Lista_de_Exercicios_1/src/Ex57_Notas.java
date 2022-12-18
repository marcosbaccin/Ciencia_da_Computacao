import javax.swing.JOptionPane;

public class Ex57_Notas {
    public static void main(String[] args) {
        int M[] = new int [10];
        float N[] = new float[10];
        float MaiorN = 0;
        float SegN = 0;
        int MaiorM = 0;
        int SegM = 0;
        for(int i = 0; i < 10; i++){
            do{
                M[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da matrículo do aluno?"));
                if(M[i] <= 0){
                    JOptionPane.showMessageDialog(null, "Número de matrícula inválido!!");
                }
            }while(M[i] <= 0);
            if(i > 0){
                for(int j = 0; j < M.length; j++){
                    if(j < i){
                        do{
                            if(M[j] == M[i]){
                                M[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor inválido!!" + "\nDigite novamente."));
                            }
                        }while(M[i] <= 0 || M[i] == M[j]);
                    }
                }
            }    
            do{
                N[i] = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a nota do aluno?"));
                if(N[i] < 0){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor positivo.");
                }
            }while(N[i] < 0);
            if(i > 0){
                for(int k = 0; k < N.length; k++){
                    if(k < i){
                        do{
                            if(N[k] == N[i]){
                                N[i] = Float.parseFloat(JOptionPane.showInputDialog("Valor inválido!!" + "\nDigite novamente."));
                            }
                        }while(N[i] < 0 || N[i] == N[k]);
                    }
                }
            }    
            if(N[i] > MaiorN){
                MaiorN = N[i];
                MaiorM = M[i];
            }if(N[i] > SegN && N[i] < MaiorN){
                SegN = N[i];
                SegM = M[i];
            }
        }
        JOptionPane.showMessageDialog(null, "Maior Nota :  " + MaiorN + "\nN° de matrícula da maior nota :  " + MaiorM + "\n2ª maior nota :  " + SegN + "\nN° de matrícula da 2ª maior nota: " + SegM);
    }
}