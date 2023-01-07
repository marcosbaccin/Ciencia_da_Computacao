import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        int menu = 0;
        List<Livro> livros = new ArrayList<Livro>();
        int qtd_livros = 0;
        int id = 0;
        while(menu != 6){
            do{
                menu = Integer.parseInt(JOptionPane.showInputDialog("1) Inicializar\n2) Cadastrar\n3) Imprimir\n4) Gravar em txt\n5) Mostrar registros\n6)Sair"));
            }while(menu < 1 && menu > 6);
            
            switch (menu) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Cadastro de livros inicializado!");
                    livros.clear();
                    break;
            
                case 2:
                    String titulo = JOptionPane.showInputDialog("Titulo:");
                    String autor = JOptionPane.showInputDialog("Autor:");
                    String editora = JOptionPane.showInputDialog("Editora:");
                    int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
                    int qtd_pgs = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Páginas:"));
                    String genero = JOptionPane.showInputDialog("Gênero:");
                    boolean capa = Boolean.parseBoolean(JOptionPane.showInputDialog("Capa (0-mole | 1-dura):"));
                    livros.add(new Livro(titulo, autor, editora, ano, preco, peso, qtd_pgs, genero, capa));
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
                    break;
                
                case 3:
                    qtd_livros = livros.size();
                    id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do livro (de 1 a " + qtd_livros + ")"));
                    JOptionPane.showMessageDialog(null, livros.get(id-1).toString());
                    break;
                
                case 4:
                    qtd_livros = livros.size();
                    id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do livro (de 1 a " + qtd_livros + ")"));
                    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\mbacc\\Documents\\GitHub\\Ciencia_da_Computacao\\Periodo_1e2\\LTP\\Cadastro_de_Livros\\src\\registros.txt"));
                    bw.write(livros.get(id-1).toString());
                    bw.close();
                    break;
                
                case 5:
                    String registros = "";
                    for (Livro livro : livros) {
                        registros += livro.toString() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, registros);
                    break;
                
                default:
                    break;
            }
        }
    }
}
