// Encapsulamento nos atributos

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String codigo;
    private int quantidade;

    public Livro(String titulo, String autor, int ano, String codigo, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    // encapsulamento = getter e setters

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAno() { return ano; }
    public String getCodigo() {return codigo; }
    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int q) { this.quantidade = q; }
}
