package aula02;

public class Carro {
    String modelo;
    String montadora;
    int ano;
    double potencia;
    double velocidade;
    boolean onOff;

    public void ligar() {
        this.onOff = true;
        System.out.println("Ligou o carro");
    }

    public void desligar() {
        this.onOff = false;
        System.out.println("Desligou o carro");
    }

    public void buzinar() {
        System.out.println("Biiiiiiiiii....");
    }

    public void acelerar() {
        this.velocidade += 20;
    }

    public void frear() {
        this.velocidade -= 30;
    }


    Carro(String newModelo, String newMontadora, int newAno, double newPotencia, boolean newOnoff, double newVelocidade) {
        this.modelo = newModelo;
        this.montadora = newMontadora;
        this.ano = newAno;
        this.potencia = newPotencia;
        this.onOff = newOnoff;
        this.velocidade = newVelocidade;

    }

    Carro() {
        
    }
}
