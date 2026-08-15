package Exercícios01.Questao3;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
