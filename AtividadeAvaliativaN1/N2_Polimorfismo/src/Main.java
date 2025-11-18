//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* cria o cliente chamando a classe cliente e solicitando o input das informações através de uma
        função dentro da classe clientes
        */
        Cliente cliente = Cliente.criarCliente();

        System.out.println("\nIdentificação realizada!");
        System.out.println(cliente);

    }
}