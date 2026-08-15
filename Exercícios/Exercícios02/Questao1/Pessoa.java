package Exercícios02.Questao1;

public class Pessoa {
    private String nome;
    private double altura;
    private double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
