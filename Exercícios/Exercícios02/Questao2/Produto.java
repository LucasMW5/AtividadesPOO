package Exercícios02.Questao2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public void vender(int quantidade) {
        if (quantidade > estoque) {
            System.out.println("Estoque insuficiente");
            return;
        }

        estoque = estoque - quantidade;
    }

    public void repor(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser positiva");
            return;
        }

        estoque = estoque + quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco <= 0) {
            System.out.println("O preço deve ser positivo");
            return;
        }

        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }
}
