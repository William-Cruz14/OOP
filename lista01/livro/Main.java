package lista01.livro;

public class Main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("A casa mal assombrada", "Chico oia", 1999);
        Livro livro2 = new Livro();

        livro1.infoLivro();
        livro2.infoLivro();
    }
}
