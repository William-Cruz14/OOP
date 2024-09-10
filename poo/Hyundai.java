package poo;

// Aqui estou usando herança ou seja a classe filha "Hyundai",
// está herdando campos e métodos da classe pai "Veiculo".
public class Hyundai extends Veiculo {
    private String modelo;
    private String cor;
    private int potencia;
    private int ano;


    // Métodos Getters e Setters
    public String getModelo()  {
        return modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String newCor) {
        this.cor = newCor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int newPotencia) {
        this.potencia = newPotencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int newAno) {
        this.ano = newAno;
    }


    // Método Informações do carro
    public void infoCarro() {
        System.out.println("\n");
        System.out.println("Modelo do carro: " + getModelo());
        System.out.println("Cor do carro: " + getCor());
        System.out.println("Potência do carro: " + getPotencia());
        System.out.println("Ano de fabricação: " + getAno());

    }

    // Sobrescrevendo o método alarme da classe pai "Veiculo".
    @Override
    public void alarme() {
        System.out.println("Blip, blip ...");

        // Utilizando a palavra chave super para chamar o método da classe pai "Veiculo".
        super.alarme();
    }

    
    // Construtores da classe "Hyundai"
    Hyundai() {}

    Hyundai(String newModelo, String newCor, int newPotencia, int newAno) {
        this.modelo = newModelo;
        this.cor = newCor;
        this.potencia = newPotencia;
        this.ano = newAno;
    }


}
