package Aula1e2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();

        Scanner sc = new Scanner(System.in);

                //PERGUNTAS

        System.out.println("Digite o nome da pessoa 1: ");
        p1.nome = sc.nextLine();
        System.out.println("Digite a altura da pessoa 1: ");
        p1.altura = sc.nextDouble();
        System.out.println("Digite o peso da pessoa 1: ");
        p1.peso = sc.nextDouble();

        System.out.println("Digite o nome da pessoa 2: ");
        p2.nome = sc.nextLine();
        System.out.println("Digite a altura da pessoa 2: ");
        p2.altura = sc.nextDouble();
        System.out.println("Digite o peso da pessoa 2: ");
        p2.peso = sc.nextDouble();

        System.out.println("Digite o nome da pessoa 3: ");
        p3.nome = sc.nextLine();
        System.out.println("Digite a altura da pessoa 3: ");
        p3.altura = sc.nextDouble();
        System.out.println("Digite o peso da pessoa 3: ");
        p3.peso = sc.nextDouble();

            //DADOS

        System.out.println("Dados da pessoa 3: ");
        System.out.println("Nome: " + p3.nome);
        System.out.println("Altura: " + p3.altura);
        System.out.println("Peso: " + p3.peso);
        System.out.println("IMC: " + p3.calcularIMC());

        System.out.println("Dados da pessoa 2: ");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Altura: " + p2.altura);
        System.out.println("Peso: " + p2.peso);
        System.out.println("IMC: " + p2.calcularIMC());

        System.out.println("Dados da pessoa 1: ");
        System.out.println("Nome: " + p1.nome);
        System.out.println("Altura: " + p1.altura);
        System.out.println("Peso: " + p1.peso);
        System.out.println("IMC: " + p1.calcularIMC());
        

        sc.close();

    
        

        
    }
}
