package aula03;

public class Main {
    public static void main(String[] args) {
        Triangulo tri1 = new Triangulo();
        
        Quadrado q1 = new Quadrado();

        q1.desenhar();

        System.out.println("A área do quadrado 'q1' é " + q1.calcularArea());
        System.out.println("O perímetro do quadrado 'q1' é " + q1.calcularPerimetro());


        Quadrado q2 = new Quadrado();
        q2.lado = 7;
        q2.desenhar();

        System.out.println("A área do quadrado 'q2' é " + q1.calcularArea());
        System.out.println("O perímetro 'q2' é " + q2.calcularPerimetro());

        System.out.println(tri1.base);
    }
}
