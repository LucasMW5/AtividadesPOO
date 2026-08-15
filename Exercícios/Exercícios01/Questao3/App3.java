package Exercícios01.Questao3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("Pessoa 1");

        System.out.print("Digite a altura: ");
        p1.altura = scanner.nextDouble();

        System.out.print("Digite o peso: ");
        p1.peso = scanner.nextDouble();

        System.out.println("IMC: " + p1.calcularImc());

        System.out.println("\nPessoa 2");

        System.out.print("Digite a altura: ");
        p2.altura = scanner.nextDouble();

        System.out.print("Digite o peso: ");
        p2.peso = scanner.nextDouble();

        System.out.println("IMC: " + p2.calcularImc());

        System.out.println("\nPessoa 3");

        System.out.print("Digite a altura: ");
        p3.altura = scanner.nextDouble();

        System.out.print("Digite o peso: ");
        p3.peso = scanner.nextDouble();

        System.out.println("IMC: " + p3.calcularImc());

        scanner.close();
    }
}
