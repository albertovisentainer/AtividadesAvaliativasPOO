public class Janta extends Refeicao{

    public Janta(String nome, double preco, int calorias){
        super(nome, preco, calorias);
    }

    public Janta(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String toString(){
        return "=== Janta ===\n" + super.toString();
    }
}
