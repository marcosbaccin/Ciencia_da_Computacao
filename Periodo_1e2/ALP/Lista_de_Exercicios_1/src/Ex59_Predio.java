import javax.swing.JOptionPane;

public class Ex59_Predio {
    public static void main(String[] args) {
        String Elevador;
        String Período;
        int ABC[] = new int[3];
        String EMF = null;
        String PEMF = null;
        int MVN[] = new int[9];
        int P[] = new int[3];
        String PMF = null;
        String EPMF = null;
        int MaP = 0;
        int MeP = 0;
        float DP;
        float PEMed = 0;
        for(int i = 1; i <= 50; i++){
            do{
                Elevador = JOptionPane.showInputDialog("Qual elevador utiliza com mais frequência ?" + "\nA)" + "\nB)" + "\nC)");
                if(!"A".equals(Elevador) && !"B".equals(Elevador) && !"C".equals(Elevador)){
                    JOptionPane.showMessageDialog(null, "Caractére inválido!!" + "\nDigite novamente.");
                }
            }while(!"A".equals(Elevador) && !"B".equals(Elevador) && !"C".equals(Elevador));
            if("A".equals(Elevador)){
                ABC[0] = ABC[0] + 1;
            }if("B".equals(Elevador)){
                ABC[1] = ABC[1] + 1;
            }if("C".equals(Elevador)){
                ABC[2] = ABC[2] + 1;
            }do{
                Período = JOptionPane.showInputDialog("Em qual período utilizava ?" + "\nM) Matutino" + "\nV) Vespertino" + "\nN) Noturno");
                if(!"M".equals(Período) && !"V".equals(Período) && !"N".equals(Período)){
                    JOptionPane.showMessageDialog(null, "Caractére inválido!!" + "\nDigite novamente.");
                }
            }while(!"M".equals(Período) && !"V".equals(Período) && !"N".equals(Período));
            if("M".equals(Período)){
                P[0] = P[0] + 1;
                if("A".equals(Elevador)){
                    MVN[0] = MVN[0] + 1;
                }if("B".equals(Elevador)){
                    MVN[3] = MVN[3] + 1;
                }if("C".equals(Elevador)){
                    MVN[6] = MVN[6] + 1;
                }
            }if("V".equals(Período)){
                P[1] = P[1] + 1;
                if("A".equals(Elevador)){
                    MVN[1] = MVN[1] + 1;
                }if("B".equals(Elevador)){
                    MVN[4] = MVN[4] + 1;
                }if("C".equals(Elevador)){
                    MVN[7] = MVN[7] + 1;
                }
            }if("N".equals(Período)){
                P[2] = P[2] + 1;
                if("A".equals(Elevador)){
                    MVN[2] = MVN[2] + 1;
                }if("B".equals(Elevador)){
                    MVN[5] = MVN[5] + 1;
                }if("C".equals(Elevador)){
                    MVN[8] = MVN[8] + 1;
                }
            }
        }
        if(ABC[0] > ABC[1] && ABC[0] > ABC[2]){
            EMF = "A";
        }if(ABC[1] > ABC[0] && ABC[1] > ABC[2]){
            EMF = "B";
        }if(ABC[2] > ABC[0] && ABC[2] > ABC[1]){
            EMF = "C";    
        }
        if(ABC[0] > ABC[1] && ABC[0] < ABC[2] || ABC[0] < ABC[1] && ABC[0] > ABC[2]){
            PEMed = ABC[0] * 100 / 50;
        }if(ABC[1] > ABC[0] && ABC[1] < ABC[2] || ABC[1] < ABC[0] && ABC[1] > ABC[2]){
            PEMed = ABC[1] * 100 / 50;
        }if(ABC[2] > ABC[0] && ABC[2] < ABC[1] || ABC[2] < ABC[0] && ABC[2] > ABC[1]){
            PEMed = ABC[2] * 100 / 50;
        }
        if("A".equals(EMF)){
            if(MVN[0] > MVN[1] && MVN[0] > MVN[2]){
                PEMF = "Matutino";
            }if(MVN[1] > MVN[0] && MVN[1] > MVN[2]){
                PEMF = "Vespertino";
            }if(MVN[2] > MVN[0] && MVN[2] > MVN[1]){
                PEMF = "Noturno";
            }
        }if("B".equals(EMF)){
            if(MVN[3] > MVN[4] && MVN[3] > MVN[5]){
                PEMF = "Matutino";
            }if(MVN[4] > MVN[3] && MVN[4] > MVN[5]){
                PEMF = "Vespertino";
            }if(MVN[5] > MVN[3] && MVN[5] > MVN[4]){
                PEMF = "Noturno";
            }
        }if("C".equals(EMF)){
            if(MVN[6] > MVN[7] && MVN[6] > MVN[8]){
                PEMF = "Matutino";
            }if(MVN[7] > MVN[6] && MVN[7] > MVN[8]){
                PEMF = "Vespertino";
            }if(MVN[8] > MVN[6] && MVN[8] > MVN[7]){
                PEMF = "Noturno";
            }
        }
        if(P[0] > P[1] && P[0] > P[2]){
            PMF = "Matutino";
            MaP = P[0];
        }if(P[1] > P[0] && P[1] > P[2]){
            PMF = "Vespertino";
            MaP = P[1];
        }if(P[2] > P[0] && P[2] > P[1]){
            PMF = "Noturno";
            MaP = P[2];
        }if(P[0] < P[1] && P[0] < P[2]){
            MeP = P[0];
        }if(P[1] < P[0] && P[1] < P[2]){
            MeP = P[1];
        }if(P[2] < P[0] && P[2] < P[1]){
            MeP = P[2];
        }
        DP = (MaP - MeP) * 100 / 50;
        if("Matutino".equals(PMF)){
            if(MVN[0] > MVN[3] && MVN[0] > MVN[6]){
                EPMF = "A";
            }if(MVN[3] > MVN[0] && MVN[3] > MVN[6]){
                EPMF = "B";
            }if(MVN[6] > MVN[0] && MVN[6] > MVN[3]){
                EPMF = "C";
            }
        }if("Vespertino".equals(PMF)){
            if(MVN[1] > MVN[4] && MVN[1] > MVN[7]){
                EPMF = "A";
            }if(MVN[4] > MVN[1] && MVN[4] > MVN[7]){
                EPMF = "B";
            }if(MVN[7] > MVN[1] && MVN[7] > MVN[4]){
                EPMF = "C";
            }
        }if("Noturno".equals(PMF)){
            if(MVN[2] > MVN[5] && MVN[2] > MVN[8]){
                EPMF = "A";
            }if(MVN[5] > MVN[2] && MVN[5] > MVN[8]){
                EPMF = "B";
            }if(MVN[8] > MVN[2] && MVN[8] > MVN[5]){
                EPMF = "C";
            }
        }
    JOptionPane.showMessageDialog(null, "Elevador mais frequentado :  " + EMF + "\nPeríodo de maior fluxo do elevador mais frequentado :  " + PEMF + "\nPeríodo mais frequentado :  " + PMF + "\nElevador mais frequentado do período mais frequentado :  " + EPMF + "\nDiferença percentual entre o maior e o menor período :  " + DP + "%" + "\nPercentagem do elevador de média utilização :  " + PEMed + "%");
    }
}