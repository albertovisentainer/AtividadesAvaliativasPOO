public class Poupanca extends ContaComum{
    private Integer dataAniversario;

    public Poupanca(String numero, Double saldo, String tipo, Integer dataAniversario){
        super(numero, saldo, tipo);
        this.dataAniversario = dataAniversario;
    }
}
