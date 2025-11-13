public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Método comum a todas as pessoas
    public void fazerAniversario() {
        this.idade++;
        System.out.println(nome + " fez aniversário! Agora tem " + idade + " anos.");
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    @Override
    public String toString() {
        return "Pessoa [Nome=" + nome + ", Idade=" + idade + ", Sexo=" + sexo + "]";
    }
}