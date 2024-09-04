package poo;

public class Pessoa {
    
    private String nome;
    private String CPF;
    private String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String newNome) {
        this.nome = newNome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String newEndereco) {
        this.CPF = newEndereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String newCPF) {
        this.CPF = newCPF;
    }
}
