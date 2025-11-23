public class Refeicao {

    protected String nome;
    protected double preco;
    protected int calorias;

    // construtor1 apenas para o nome
    public Refeicao(String nome) {
        this.nome = nome;
    }

    // construtor2 para nome + preco
    public Refeicao(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    // construtor 3 para nome + preco + calorias
    public Refeicao(String nome, double preco, int calorias){
        this.nome = nome;
        this.preco = preco;
        this.calorias = calorias;
    }

    @Override
    public String toString(){
        return
            "Prato escolhido: " + nome +
            "\nPreço: R$ " + preco +
            "\nCalorias: " + calorias;
    }
}
