public class Main {
    public static void main(String[] args) {
        // criar o objeto

        Celular celular1 = new Celular("Apple", "iPhone 14 Pro Max", 256, true);
        Celular celular2 = new Celular("Apple", "iPhone 13", 128, false);
        Celular celular3 = new Celular("Motorola", "Moto G54", 128, false);


        System.out.println("Marca: " + celular3.getMarca());
        System.out.println("Modelo " + celular3.getModelo());


        // uso do set para alterar o nome da marca e modelo do celular3
        celular3.setMarca("Samsung");
        celular3.setModelo("S24 Fe");

        // exibição da nova marca do Celular3 com o get depois de ser alterado com o uso do set
        System.out.println("\nMarca do Celular3 alterado para: " + celular3.getMarca());
        System.out.println("Modelo do Celular3 alterado para: " + celular3.getModelo());


        // exibir as caracteristicas do celular com o uso do get
        System.out.println("\nCelular disponível: ");
        System.out.println("Marca " + celular3.getMarca());
        System.out.println("Modelo: " + celular3.getModelo());
        System.out.println("Capacidade de armazenamento: " + celular3.getCapacidadeGB() + "GB");

        // métodos de manipulação do objeto celular
        celular3.ligar();

    }
}