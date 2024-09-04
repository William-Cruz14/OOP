package lista01.produto;

public class Produto {
    String nome;
    double preco;
    String categoria;


    public void description() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Categoria do produto: " + categoria);
    }

    Produto(String newNome, double newPreco, String newCategoria) {
        this.nome = newNome;
        this.preco = newPreco;
        this.categoria = newCategoria;
    }

    Produto(){}
}
