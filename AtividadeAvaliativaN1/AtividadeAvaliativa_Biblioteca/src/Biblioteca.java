import java.util.ArrayList;

// relacionamento entre classes Biblioteca contem Livros
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro cadastrado: " + livro.getTitulo());
    }

    public void listarLivros() {
        for (Livro l : livros){
            System.out.println(l.getTitulo() + " | Autor: " + l.getAutor() + " | Quantidade: " + l.getQuantidade());
        }
    }

    // sobrecarga de metodo: duas formas de buscar
    public Livro buscarLivro(String titulo) {
        for (Livro l : livros)
            if (l.getTitulo().equalsIgnoreCase(titulo))
                return l;
        return null;
    }

    public Livro buscarLivro(int anoPublicacao) {
        for (Livro l : livros)
            if (l.getAno() == anoPublicacao)
                return l;
        return null;
    }

    public boolean emprestarLivro(String titulo) {
        Livro l = buscarLivro(titulo);
        if (l != null && l.getQuantidade() > 0) {
            l.setQuantidade(l.getQuantidade() - 1);
            System.out.println("Empréstimo realizado!");
            return true;
        }
        System.out.println("Livro indisponível para empréstimo no momento.");
        return false;
    }

    public void devolverLivro(String titulo){
        Livro l = buscarLivro(titulo);
        if (l != null){
            l.setQuantidade(l.getQuantidade() + 1);
            System.out.println("Devolução registrada!");
        }
    }
}
