package Exercícios02.Questao3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContaBancaria cb1 = new ContaBancaria();
        ContaBancaria cb2 = new ContaBancaria();

        System.out.println("Digite os dados da primeira conta:");

        System.out.print("Número da conta: ");
        cb1.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Titular: ");
        cb1.setTitular(scanner.nextLine());

        System.out.println("\nDigite os dados da segunda conta:");

        System.out.print("Número da conta: ");
        cb2.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Titular: ");
        cb2.setTitular(scanner.nextLine());

        cb1.depositar(1000);
        cb1.depositar(700);

        cb2.depositar(5000);

        cb2.sacar(3000);

        cb2.transferir(cb1, 1800);

        System.out.println("\n--- Contas ---");

        System.out.println("Titular: " + cb1.getTitular());
        System.out.println("Saldo: " + cb1.getSaldo());

        System.out.println();

        System.out.println("Titular: " + cb2.getTitular());
        System.out.println("Saldo: " + cb2.getSaldo());

        scanner.close();
    }
}
