public class BancoFinanceiro implements OperacoesBasicasBanco{
    // atributos
    private Conta conta1;

    //funcao para criar conta
    public void criarConta(){
        conta1 = new Conta("Alberto", 1000.00);
    }

    //funcoes que usam os metodos da classe conta
    public void depositar(double valor){
        conta1.depositar(valor);
    }

    public void sacar (double valor){
        conta1.sacar(valor);
    }


}
