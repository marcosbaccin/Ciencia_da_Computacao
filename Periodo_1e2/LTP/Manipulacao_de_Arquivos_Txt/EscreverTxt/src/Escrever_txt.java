import javax.swing.*;
import java.io.*;
import java.util.*;

public class Escrever_txt {
    public static void main(String[] args) throws IOException {
        String nomeArq = JOptionPane.showInputDialog("Digite o nome do arquivo: ");
        String dir = "C:\\Users\\mbacc\\Documents\\GitHub\\Ciencia_da_Computacao\\Periodo_1e2\\LTP\\Manipulacao_de_Arquivos_Txt\\"+nomeArq+".txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(dir));
        Random n = new Random();
        int cont;
        do{
            int cod = n.nextInt(1000);
            String nome = JOptionPane.showInputDialog("Nome:");
            String endereco = JOptionPane.showInputDialog("Endereço:");
            String telefone = JOptionPane.showInputDialog("Telefone:");
            String email = JOptionPane.showInputDialog("Email:");
            String dados = cod + "; " + nome + "; " + endereco + "; " + telefone + "; " + email + "\n";
            bw.write(dados);
            cont = Integer.parseInt(JOptionPane.showInputDialog("1) Novo cadastro\n0) Finalizar"));
        }while(cont != 0);
        bw.close();
    }
}