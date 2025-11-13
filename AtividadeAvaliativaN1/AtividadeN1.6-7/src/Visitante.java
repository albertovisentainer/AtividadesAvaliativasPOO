// Visitante herda de Pessoa, mas não adiciona nada novo
public class Visitante extends Pessoa {
    public Visitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
}