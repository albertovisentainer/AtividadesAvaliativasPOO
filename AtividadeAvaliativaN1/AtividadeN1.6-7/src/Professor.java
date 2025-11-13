// Professor herda de Pessoa
public class Professor extends Pessoa {
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void receberAumento(double valor) {
        salario += valor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Especialidade: " + especialidade + ", Salário: " + salario;
    }
}