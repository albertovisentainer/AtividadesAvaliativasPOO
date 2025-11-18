import java.util.Scanner;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public static Cliente criarCliente(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira seu CPF: ");
        String cpf = sc.nextLine();

        return new Cliente(nome, cpf);
    }

    @Override
    public String toString(){
        System.out.println("Nome: " + nome + "\nCPF: " + cpf);
        return "";
    }
}
