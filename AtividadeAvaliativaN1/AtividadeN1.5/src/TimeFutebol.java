public class TimeFutebol {
    // atributos

    private String nomeTime;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;

    // constructor
    public TimeFutebol(String nomeTime, Integer vitorias, Integer derrotas, Integer empates) {
        this.nomeTime = nomeTime;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // getters e setters


    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Integer getVitorias() {
        return vitorias;
    }

    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }

    public Integer getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }

    public Integer getEmpates() {
        return empates;
    }

    public void setEmpates(Integer empates) {
        this.empates = empates;
    }

    // metodos

    public void ganhar(){
        vitorias++;
    }
    public void perder(){
        derrotas++;
    }
    public void empate(){
        empates++;
    }
}
