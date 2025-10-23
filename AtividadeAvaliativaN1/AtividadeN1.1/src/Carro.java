public class Carro {
    // atributos para um carro
   public String marca;
   public String cor;
   public int velocidadeAtual;

    // comecar parado
    public Carro (String marca, String cor){
        this.marca = marca;
        this.cor = cor;
        this.velocidadeAtual = 0;

    }

    //metodo acelerar
    public  void acelerar (int incremento){
        velocidadeAtual += incremento;
        System.out.println("O carro acelerou para " + velocidadeAtual + " Km/h");
    }

    //metodo frear
    public void frear (int decremento){
        if(velocidadeAtual - decremento < 0){
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= decremento;
        }
        System.out.println("O carro reduziu para " + velocidadeAtual + " Km/h");
    }

    //metodo buzinar
    public void buzinar(){
        System.out.println("Biiiiiiiiiiiiiiiiiiii!");
    }
}