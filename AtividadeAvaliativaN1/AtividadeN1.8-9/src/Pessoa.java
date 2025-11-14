public abstract class Pessoa {
    // atributos de cadastro de clientes

    protected String nome;
    protected String endereco;
    protected String telefone;

    public Pessoa(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public abstract void gravar();

    public String toString(){
        return "Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }
}
