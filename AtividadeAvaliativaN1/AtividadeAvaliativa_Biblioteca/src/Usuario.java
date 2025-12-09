// classe abstrata com herança e polimorfismo
public abstract class Usuario {
    protected String nome;
    protected String id;

    public Usuario(String nome, String id){
        this.nome = nome;
        this.id = id;
    }

    // encapsulamento = getter e setters
    public String getNome() {return  nome; }
    public String getId() {return id; }

    // polimorfismo de sobreposição pelas subclasses
    public abstract void exibirMenu();
}

