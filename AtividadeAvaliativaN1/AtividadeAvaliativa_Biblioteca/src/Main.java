//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca bib = new Biblioteca();

        Usuario leitor = new Leitor("Alberto", "L01");
        Usuario funcionario = new Funcionario("Roberto", "F01");

        funcionario.exibirMenu();
        leitor.exibirMenu();

        // cadastro de livros pelo funcionario
        Livro livro1 = new Livro("Java Escrito", "Robertinho Senai", 2025, "001", 3);
        Livro livro2 = new Livro("Era uma prova, mas choveu!", "Coordenação SENAI", 2025, "002", 2);

        ((Funcionario) funcionario).cadastrarLivro(bib, livro1);
        ((Funcionario) funcionario).cadastrarLivro(bib, livro2);

        // listagem de livros
        bib.listarLivros();

        // emprestimo de livro pelo leitor
        bib.emprestarLivro("Java escrito");

        //listagem de livros atualizada
        bib.listarLivros();

        // devolucao de livro pelo leitor
        bib.devolverLivro("Java escrito");

        //listagem de livros atualizada
        bib.listarLivros();

    }
}