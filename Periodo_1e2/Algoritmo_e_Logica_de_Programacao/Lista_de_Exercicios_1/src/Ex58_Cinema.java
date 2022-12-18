import javax.swing.JOptionPane;

public class Ex58_Cinema {
    public static void main(String[] args) {
        int Idade;
        String Opinião;
        int OP[] = new int[5];
        int DPBR;
        float MIR = 0;
        int MIP = 0;
        int MIO = 0;
        int MIdR = 0;
        for(int i = 1; i <= 10; i++){
            do{
                Idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
                if(Idade <= 0){
                    JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor maior que 0.");
                }
            }while(Idade <=0);
            do{
                Opinião = JOptionPane.showInputDialog("Qual a sua opinião em relação ao filme?" + "\nA) Ótimo" + "\nB) Bom" + "\nC) Regular" + "\nD) Ruim" + "\nE) Péssimo");
                if(!"A".equals(Opinião) && !"B".equals(Opinião) && !"C".equals(Opinião) && !"D".equals(Opinião) && !"E".equals(Opinião)){
                    JOptionPane.showMessageDialog(null, "Caractére inválido!!" + "\nDigite novamente.");
                }
            }while(!"A".equals(Opinião) && !"B".equals(Opinião) && !"C".equals(Opinião) && !"D".equals(Opinião) && !"E".equals(Opinião));
            if("A".equals(Opinião)){
                OP[0] = OP[0] + 1;
                if(Idade > MIO){
                    MIO = Idade;
                }
            }if("B".equals(Opinião)){
                OP[1] = OP[1] + 1;
            }if("C".equals(Opinião)){
                OP[2] = OP[2] + 1;
            }if("D".equals(Opinião)){
                OP[3] = OP[3] + 1;
                MIR = MIR + Idade;
                if(Idade > MIdR){
                    MIdR = Idade;
                }
            }if("E".equals(Opinião)){
                OP[4] = OP[2] + 1;
                if(Idade > MIP){
                    MIP = Idade;
                }
            }
        }
        DPBR = (OP[1] - OP[2]) * 10;
        MIR = MIR / OP[3];
        JOptionPane.showMessageDialog(null, "Quantidade de respostas ÓTIMO :  " + OP[0] + "\nDiferença percentual entre BOM e REGULAR :  " + DPBR + "%" + "\nMédia de idade de quem achou RUIM :  " + MIR + "\nPercentual de pessoas que acharam PÉSSIMO :  " + (OP[4] * 10) + "%" + "\nMaior idade de quem achou PÉSSIMO :  " + MIP + "\nDiferença das maiores idades entre ÓTIMO e RUIM :  " + (MIO - MIdR));
    }
}