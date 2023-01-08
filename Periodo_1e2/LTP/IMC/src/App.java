import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Informe seu nome:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia em que você nasceu:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês em que você nasceu:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano em que você nasceu:"));
        Calendar nascimento = new GregorianCalendar(ano, mes-1, dia);
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
        Usuario usuario = new Usuario(nome, nascimento, altura, peso);
        JOptionPane.showMessageDialog(null, usuario.toString());
    }
}
