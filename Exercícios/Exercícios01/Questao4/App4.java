package Exercícios01.Questao4;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("Pessoa 1");

        System.out.print("Nome: ");
        p1.nome = scanner.nextLine();

        System.out.print("Altura: ");
        p1.altura = scanner.nextDouble();

        System.out.print("Peso: ");
        p1.peso = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("\nPessoa 2");

        System.out.print("Nome: ");
        p2.nome = scanner.nextLine();

        System.out.print("Altura: ");
        p2.altura = scanner.nextDouble();

        System.out.print("Peso: ");
        p2.peso = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("\nPessoa 3");

        System.out.print("Nome: ");
        p3.nome = scanner.nextLine();

        System.out.print("Altura: ");
        p3.altura = scanner.nextDouble();

        System.out.print("Peso: ");
        p3.peso = scanner.nextDouble();

        System.out.println("\n--- Dados das pessoas ---");

        System.out.println("Nome: " + p3.nome);
        System.out.println("Altura: " + p3.altura);
        System.out.println("Peso: " + p3.peso);
        System.out.println("IMC: " + p3.calcularImc());

        System.out.println();

        System.out.println("Nome: " + p2.nome);
        System.out.println("Altura: " + p2.altura);
        System.out.println("Peso: " + p2.peso);
        System.out.println("IMC: " + p2.calcularImc());

        System.out.println();

        System.out.println("Nome: " + p1.nome);
        System.out.println("Altura: " + p1.altura);
        System.out.println("Peso: " + p1.peso);
        System.out.println("IMC: " + p1.calcularImc());

        scanner.close();
    }
}
