// Técnico também é um tipo de Aluno
public class Tecnico extends Aluno {
    private String registroProfissional;

    public Tecnico(String nome, int idade, String sexo, int matricula, String curso, String registroProfissional) {
        super(nome, idade, sexo, matricula, curso);
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println(nome + " está praticando atividades técnicas.");
    }
}