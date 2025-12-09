// subclasse que herdará de usuário que é uma classe mãe

public class Leitor extends Usuario{
    public Leitor(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void exibirMenu() {
        System.out.println("Menu Leitor: Consultar livros, realizar empréstimos e devoluções.");
    }
}
