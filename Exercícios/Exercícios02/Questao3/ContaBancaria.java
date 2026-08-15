package Exercícios02.Questao3;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Não é possível depositar um valor negativo.");
            return;
        }

        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor < 0) {
            System.out.println("Não é possível sacar um valor negativo.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo = saldo - valor;
    }

    void transferir(ContaBancaria destino, double valor) {
        if (valor < 0) {
            System.out.println("Não é possível transferir um valor negativo.");
            return;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }

        saldo = saldo - valor;
        destino.depositar(valor);
    }
}
