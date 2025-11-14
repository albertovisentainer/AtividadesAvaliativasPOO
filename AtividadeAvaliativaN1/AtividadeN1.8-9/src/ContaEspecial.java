public class ContaEspecial extends ContaComum{
    private double limite;

    public ContaEspecial(String numero, Double saldo, String tipo, double limite){
        super(numero, saldo, tipo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor < saldo + limite){
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado.");
        }
        else {
            System.out.println("Limite insuficiente.");
        }
        registra();
    }
}
