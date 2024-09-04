package aula03;

public class Triangulo {
    double base;
    double altura;
    double hipotenusa;

    Triangulo(){}

    Triangulo(double newBase, double newAltura) {
        base = newBase;
        altura = newAltura;
        hipotenusa = Math.sqrt((base * base) + (altura * altura));
    }

    double calcularArea() {
        return (base * altura) / 2; 
    }

    double calcularPerimetro() {
        return base + altura + hipotenusa;

    }
    

    void desenharArea() {
        System.out.println();
    }
}
