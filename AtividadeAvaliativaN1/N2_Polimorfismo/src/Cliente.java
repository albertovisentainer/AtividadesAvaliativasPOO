import java.util.Scanner;

public class Cliente {
    private final String nome;
    private final String cpf;

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

        while (!validarCPF(cpf)){
            System.out.println("CPF inválido. Favor conferir e informar novamente o CPF.");
            cpf = sc.nextLine();
        }

        return new Cliente(nome, cpf);
    }

    private static boolean validarCPF(String cpf){
        return cpf.length() == 11;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\nCPF: " + cpf;
    }
}
