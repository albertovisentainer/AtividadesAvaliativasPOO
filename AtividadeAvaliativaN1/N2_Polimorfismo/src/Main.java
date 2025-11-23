public class Main {
    public static void main(String[] args) {


        Cliente cliente = Cliente.criarCliente();
        System.out.println("\nIdentificação realizada!");
        System.out.println(cliente);

        MenuRefeicoes menu = new MenuRefeicoes();

        Refeicao r = menu.escolherRefeicao();

        if (r != null){
            System.out.println("\n===== RESUMO =====");
            System.out.println(r);
        }
    }
}