package Exercícios01.Questao2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("Digite sua altura: ");
        pessoa.altura = scanner.nextDouble();

        System.out.print("Digite seu peso: ");
        pessoa.peso = scanner.nextDouble();

        System.out.println("O IMC é: " + pessoa.calcularImc());

        scanner.close();
    }
}
