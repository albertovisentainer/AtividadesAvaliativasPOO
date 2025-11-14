public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String telefone, String cnpj){
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public void gravar(){
        System.out.println("Gravando cliente jurídico: " + nome);
    }

    @Override
    public String toString(){
        return super.toString() + "CNPJ: " + cnpj;
    }
}
