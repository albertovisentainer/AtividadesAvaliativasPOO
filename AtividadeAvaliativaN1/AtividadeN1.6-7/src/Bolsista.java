// Bolsista é um tipo de Aluno
public class Bolsista extends Aluno {
    private double bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println(nome + " renovou a bolsa de " + bolsa + "%");
    }

    // Sobrescrita do método da classe Aluno
    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " é bolsista, pagamento facilitado!");
    }
}