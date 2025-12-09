// subclasse que herdará de usuário que é uma classe mãe
// sobrescrita de metodo

public class Funcionario extends Usuario {
    public Funcionario(String nome, String id) {
        super(nome, id);
    }

    @Override
    public void exibirMenu(){
        System.out.println("Menu Funcionário: Cadastrar livros, emprestar e receber devoluçÕes.");
    }

    // Metodo exclusivo para funcionario
    public void cadastrarLivro(Biblioteca bib, Livro l) {
        bib.adicionarLivro(l);
    }
}
