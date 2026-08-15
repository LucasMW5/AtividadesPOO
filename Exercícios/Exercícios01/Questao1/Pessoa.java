package Exercícios01.Questao1;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
