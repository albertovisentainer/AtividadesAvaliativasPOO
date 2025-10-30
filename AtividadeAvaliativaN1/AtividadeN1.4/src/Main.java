//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BancoFinanceiro banco = new BancoFinanceiro();
        banco.criarConta();
        banco.depositar(500);
        banco.sacar(200);
    }
}