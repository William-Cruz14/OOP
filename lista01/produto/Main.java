package lista01.produto;

public class Main {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Bolacha", 5.50, "Cereais");
        Produto produto02 = new Produto();

        produto01.description();
        produto02.description();
    }
}
