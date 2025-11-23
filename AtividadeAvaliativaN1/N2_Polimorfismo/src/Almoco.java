public class Almoco extends Refeicao{

    public Almoco(String nome, double preco, int calorias){
        super(nome, preco, calorias);
    }

    public Almoco(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String toString(){
        return "=== Almoço ===\n" + super.toString();
    }
}
