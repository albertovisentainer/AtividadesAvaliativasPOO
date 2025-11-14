public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, String endereco, String telefone, String cpf){
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    @Override
    public void gravar(){
        System.out.println("Gravando cliente físico: " + nome);
    }

    @Override
    public String toString(){
        return super.toString() + "CPF: " + cpf;
    }
}