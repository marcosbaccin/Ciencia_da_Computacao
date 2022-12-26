import javax.swing.JOptionPane;

public class Ex33_RestoDiv {
    public static void main(String[] args) {
        int Dvd;
        int Div;
        int R;
        do{
            Dvd = Integer.parseInt(JOptionPane.showInputDialog("Informe o dividendo:"));
            if(Dvd < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro positivo.");
            }
        }while(Dvd < 0);
        do{
            Div = Integer.parseInt(JOptionPane.showInputDialog("Informe o divisor:"));
            if(Div <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro maior que 0.");
            }
        }while(Div <= 0);
        if(Dvd == 0){
            R = 0;
        }else{R = Dvd - Div;
            while(R >= Div){
                R = R - Div;
            }
        }
        JOptionPane.showMessageDialog(null, Dvd + " mod " + Div + " :  " + R);
    }
}