package aula03;

public class Quadrado {
    
    double lado;

    Quadrado(){}

    Quadrado(double newLado) {
        lado = newLado;

    }

    double calcularArea() {
        return lado * lado;
    }

    double calcularPerimetro(){
        return lado * 4;
    }

    void desenhar() {
        for(int i = 0; i < lado; i++) {
            for(int j = 0; j < lado; j++) {
                System.out.println("*");
            }
            
            System.out.println("\n");

        }
    }
}
