//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica("Joaozinho Santos", "Rua A A A , 123", "87 832139832", "12345678901");
        PessoaJuridica pj = new PessoaJuridica("Zezinho Serviços", "Rua A A A , 123", "87 832139832", "54627876999187");

        System.out.println(pf);
        System.out.println(pj);

        pf.gravar();
        pj.gravar();

        ContaComum c1 = new ContaComum("00001", 500, "001 - Conta Corrente");
        ContaEspecial c2 = new ContaEspecial("00001", 2000.00, "002 - Conta Especial", 5000.00);
        Poupanca p1 = new Poupanca("00001", 3000.00, "013 - Conta Poupança", 20230112);

        c1.depositar(200.00);
        c2.sacar(1000.00);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(p1);
    }
}