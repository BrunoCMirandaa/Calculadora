package com.higor;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculator calculator = new Calculator();
        String continuar = "s";

        double result;

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            System.out.print("Digite o número da operação desejada: ");
            int escolha = scanner.nextInt();

            result = calculator.executeOperation(numero1, numero2, escolha);

            System.out.println("O resultado é: " + result);

            System.out.print("Deseja realizar outra operação? (s/n): ");
            continuar = scanner.next();
        }

        // Fechar o scanner
        scanner.close();
    }
}