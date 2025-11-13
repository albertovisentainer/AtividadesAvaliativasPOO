//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
        Aluno a1 = new Aluno("Carlos", 20, "Masculino", 1, "Engenharia");

        System.out.println(a1);

        // Chamando o metodo herdado da classe Pessoa
        System.out.println("\n--- Fazendo aniversário ---");
        a1.fazerAniversario();

        System.out.println("\nApós os aniversários:");
        System.out.println(a1);
    }
}