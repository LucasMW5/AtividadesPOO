package Exercícios02.Questao1;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        System.out.println("Digite os dados da primeira pessoa:");

        System.out.print("Nome: ");
        p1.setNome(scanner.nextLine());

        System.out.print("Altura: ");
        p1.setAltura(scanner.nextDouble());

        System.out.print("Peso: ");
        p1.setPeso(scanner.nextDouble());

        scanner.nextLine();

        System.out.println("\nDigite os dados da segunda pessoa:");

        System.out.print("Nome: ");
        p2.setNome(scanner.nextLine());

        System.out.print("Altura: ");
        p2.setAltura(scanner.nextDouble());

        System.out.print("Peso: ");
        p2.setPeso(scanner.nextDouble());

        scanner.nextLine();

        System.out.println("\nDigite os dados da terceira pessoa:");

        System.out.print("Nome: ");
        p3.setNome(scanner.nextLine());

        System.out.print("Altura: ");
        p3.setAltura(scanner.nextDouble());

        System.out.print("Peso: ");
        p3.setPeso(scanner.nextDouble());

        System.out.println("\n--- Dados das pessoas ---");

        System.out.println("Nome: " + p3.getNome());
        System.out.println("Altura: " + p3.getAltura());
        System.out.println("Peso: " + p3.getPeso());
        System.out.println("IMC: " + p3.calcularImc());

        System.out.println();

        System.out.println("Nome: " + p2.getNome());
        System.out.println("Altura: " + p2.getAltura());
        System.out.println("Peso: " + p2.getPeso());
        System.out.println("IMC: " + p2.calcularImc());

        System.out.println();

        System.out.println("Nome: " + p1.getNome());
        System.out.println("Altura: " + p1.getAltura());
        System.out.println("Peso: " + p1.getPeso());
        System.out.println("IMC: " + p1.calcularImc());

        scanner.close();
    }
}
