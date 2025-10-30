public class Conta {
    private String titular;
    private double saldo;

    // constructor

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // getters e setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // metodo de operacao
    public void depositar (double valor){
        saldo += valor;
    }
    public void sacar (double valor){
        if (valor <= saldo){
            saldo -= valor;
        }else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
