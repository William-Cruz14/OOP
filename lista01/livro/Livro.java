package lista01.livro;

public class Livro {
    // Atributos da Classe.
    String tituto;
    String autor;
    int anoPub;
    
    // Método da Classe 
    public void infoLivro() {
        System.out.println("Titulo do Livro: " + tituto);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPub);
    }

    // Construtor com 3 argumentos.
    Livro(String newTitulo, String newAutor, int newAnopub) {
        this.tituto = newTitulo;
        this.autor = newAutor;
        this.anoPub = newAnopub;
    }

    // Construtor vazio.
    Livro(){}
}
