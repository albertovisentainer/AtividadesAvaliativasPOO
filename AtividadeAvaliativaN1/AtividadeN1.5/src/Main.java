//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // criar alguns objetos chamados times

        TimeFutebol time1 = new TimeFutebol("Palmeiras", 5, 2, 1);
        TimeFutebol time2 = new TimeFutebol("Corinthians", 3, 4, 1);

        // Criando um objeto da classe Partida e passando objetos de TimeFutebol como parâmetros
        Partida jogo1 = new Partida(time1, time2, 90);

        // Chamando metodo que usa objetos de outra classe
        jogo1.marcarJogo();

        // exibir algumas informações iniciais sobre os times
        System.out.println("=== Situação Inicial ===");
        System.out.println(time1.getNomeTime());
        System.out.println("Vitórias: " + time1.getVitorias());
        System.out.println("Derrotas: " + time1.getDerrotas());
        System.out.println("Empates: "+ time1.getEmpates() + "\n");

        System.out.println(time2.getNomeTime());
        System.out.println("Vitórias: " + time2.getVitorias());
        System.out.println("Derrotas: " + time2.getDerrotas());
        System.out.println("Empates: "+ time2.getEmpates() + "\n");

        // Simulando um resultado da partida
        System.out.println("Partida iniciada!");
        System.out.println("--------------------");
        System.out.println("Partida finalizada!");
        System.out.println("--------------------");

        jogo1.jogar("Palmeiras");

        // Exibindo placar atualizado
        System.out.println("\n=== Situação Atual ===");
        System.out.println(time1.getNomeTime());
        System.out.println("Vitórias: " + time1.getVitorias());
        System.out.println("Derrotas: " + time1.getDerrotas());
        System.out.println("Empates: "+ time1.getEmpates() + "\n");

        System.out.println(time2.getNomeTime());
        System.out.println("Vitórias: " + time2.getVitorias());
        System.out.println("Derrotas: " + time2.getDerrotas());
        System.out.println("Empates: "+ time2.getEmpates() + "\n");
    }
}