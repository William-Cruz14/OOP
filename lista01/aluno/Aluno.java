package lista01.aluno;

public class Aluno {
    String nome;
    int idade;
    int serie;

    public void exibirInfo() {
        System.out.println("Nome do aluno: " + nome + "\n" + "Idade do aluno: " + idade + "\n" + "Grau de ensino: " + serie);
    }

    Aluno(String newNome, int newIdade, int newSerie) {
        this.nome = newNome;
        this.idade = newIdade;
        this.serie = newSerie;
    }


    Aluno(){}

    
}