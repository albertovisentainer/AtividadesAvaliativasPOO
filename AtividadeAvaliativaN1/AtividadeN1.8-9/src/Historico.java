public class Historico {
    private String numeroConta;
    private String tipoConta;

    public Historico(String numeroConta, String tipoConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public void gravar(){
        System.out.println("Histórico registrado para conta " + numeroConta + " (\ntipo " + tipoConta + ")");
    }
}
