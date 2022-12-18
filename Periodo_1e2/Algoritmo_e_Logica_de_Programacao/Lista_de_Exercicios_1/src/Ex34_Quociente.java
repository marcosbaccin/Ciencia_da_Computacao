import javax.swing.JOptionPane;

public class Ex34_Quociente {
    public static void main(String[] args) {
        int Dvd;
        int Div;
        float Q = 0;
        do{
            Dvd = Integer.parseInt(JOptionPane.showInputDialog("Informe o dividendo:"));
            if(Dvd < 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor positivo.");
            }
        }while(Dvd < 0);
        do{
            Div = Integer.parseInt(JOptionPane.showInputDialog("Informe o divisor:"));
            if(Div <= 0){
                JOptionPane.showMessageDialog(null, "Valor inválido!!" + "\nDigite um valor inteiro maior que 0.");
            }
        }while(Div <= 0);
        if(Dvd >= Div){
            float c;
            c = Dvd;
            do{
            c = c - Div;
            Q = Q + 1;
            }while(c >= Div);
        }if(Dvd == 0){
            Q = 0; 
        }
        JOptionPane.showMessageDialog(null, Dvd + " / " + Div + " =  " + Q);
    }
}