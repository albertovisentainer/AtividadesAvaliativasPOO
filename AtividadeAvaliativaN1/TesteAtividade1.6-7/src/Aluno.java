public class Aluno extends Pessoa{
    protected Integer matricula;
    protected String curso;

    public Aluno(String nome, int idade, String sexo, Integer matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println(nome + " pagou a mensalidade do curso " + curso);
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", Curso: " + curso;
    }
}
