public class ContaComum {
    protected String numero;
    protected double saldo;
    protected String tipo;

    public ContaComum(String numero, double saldo, String tipo) {
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de R$: " + valor + " realizado.");
        registra();
    }
    public void sacar(double valor){
        if (valor < saldo){
            saldo -= valor;
            System.out.println("Saque de R$: " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
        registra();
    }
    public void registra(){
        Historico h = new Historico (numero, tipo);
        h.gravar();
    }
    @Override
    public String toString(){
        return "Conta Nº: " + numero + " | Saldo: " + saldo + " | Tipo: " + tipo;
    }
}
