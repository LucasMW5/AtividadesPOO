package Exercícios01.Questao2;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
