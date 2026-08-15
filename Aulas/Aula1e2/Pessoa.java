package Aula1e2;
public class Pessoa {

    double altura;
    double peso;
    String nome;

    double calcularIMC() {
        return peso / (altura * altura);
    }

}
