public class Main {
    public static void main(String[] args) {
        // Criando o objeto
        Carro meuCarro = new Carro("Jeep", "Bordô");

        // Manipulando o estado via métodos
        meuCarro.acelerar(30);
        meuCarro.frear(10);
        meuCarro.buzinar();
    }
}