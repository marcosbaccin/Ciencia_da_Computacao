import java.util.Calendar;

public class Usuario {
    private String nome;
    private Calendar data_nascimento;
    private double altura;
    private double peso;

    public Usuario(String nome, Calendar data_nascimento, double altura, double peso){
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData_nascimento(Calendar data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public String getNome(){
        return this.nome;
    }

    public Calendar getData_nascimento(){
        return this.data_nascimento;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public double getPeso(){
        return this.peso;
    }

    public double imc(){
        return this.peso / (Math.pow(this.altura, 2));
    }

    private int idade(){
        Calendar data_atual = Calendar.getInstance();
        int idade = data_atual.get(Calendar.YEAR) - this.data_nascimento.get(Calendar.YEAR);
        if(data_atual.before(this.data_nascimento)){
            idade--;
        }
        return idade;
    }

    public String toString(){
        
        String str = "Nome: " + this.nome + "\nIdade: " + idade() + "\nIMC: " + this.imc();
        return str;
    }
}
