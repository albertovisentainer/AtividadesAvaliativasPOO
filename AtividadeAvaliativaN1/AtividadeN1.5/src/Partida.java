// classe que representa uma partida de futebol
public class Partida {
    // Atributos que associam Partida com a classe TimeFutebol

    private TimeFutebol timeDesafiante;
    private TimeFutebol timeDesafiado;
    private Integer tempoRegular;
    private String resultado;

    // Construtor — recebe objetos de outra classe como parâmetros

    public Partida(TimeFutebol timeDesafiante, TimeFutebol timeDesafiado, Integer tempoRegular) {
        this.timeDesafiante = timeDesafiante;
        this.timeDesafiado = timeDesafiado;
        this.tempoRegular = tempoRegular;
    }

    // Metodo que apenas informa quais times jogarão

    public void marcarJogo(){
        System.out.println("Jogo marcado entre " + timeDesafiante.getNomeTime() + " e " + timeDesafiado.getNomeTime());
    }

    // Metodo que simula o jogo e usa objetos da classe TimeFutebol
    public void jogar(String vencedor){
        if(vencedor.equalsIgnoreCase(timeDesafiante.getNomeTime())){
            timeDesafiado.perder();
            timeDesafiante.ganhar();
            resultado = timeDesafiante.getNomeTime() + " Venceu!";
        } else if (vencedor.equalsIgnoreCase(timeDesafiado.getNomeTime())){
            timeDesafiado.ganhar();
            timeDesafiante.perder();
            resultado = timeDesafiado.getNomeTime() + " Venceu!";
        }else {
            timeDesafiante.empate();
            timeDesafiado.empate();
            resultado = "Empate!";
        }
        // exibe o resultado da partida
        System.out.println("Resultado: " + resultado);
    }
}
