package lista01.aluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("William", 90, 8);
        Aluno aluno02 = new Aluno();

        aluno01.exibirInfo();
        System.out.println();
        aluno02.exibirInfo();
    }
    
}
