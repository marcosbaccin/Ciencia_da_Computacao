public class Livro {
    String titulo;
    String autor;
    String editora;
    int ano;
    double preco;
    double peso;
    int qtd_pgs;
    String genero;
    boolean capa;

    public Livro(String titulo, String autor, String editora, int ano, double preco, double peso, int qtd_pgs,
    String genero, boolean capa){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.preco = preco;
        this.peso = peso;
        this.qtd_pgs = qtd_pgs;
        this.genero = genero;
        this.capa = capa;
        
        if(!this.capa){
            this.preco = this.preco - (this.preco*0.2);
        }
    }

    public String toString(){
        String str = this.titulo + "; " + this.autor + "; " + this.editora + "; " + this.ano + "; " +
        this.preco + "; " + this.peso + "; " + this.qtd_pgs + "; " + this.genero + "; " ;

        if(!this.capa){
            str += "mole";
        } else {
            str += "dura";
        }

        return str;
    }
}
