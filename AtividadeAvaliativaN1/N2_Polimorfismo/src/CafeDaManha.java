public class CafeDaManha extends Refeicao{

    public CafeDaManha(String nome, double preco, int calorias){
        super(nome, preco, calorias);
    }

    public CafeDaManha(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String toString(){
        return "=== Café da Manhã ===\n" + super.toString();
    }
}
