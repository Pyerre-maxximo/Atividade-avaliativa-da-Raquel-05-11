package Questões;

import java.util.Scanner;

public class Questão24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: ");
        double custoFabrica = scanner.nextDouble();

        double custoFinal = custoFabrica * (1 + 0.28 + 0.45);

        System.out.printf("O custo final ao consumidor é: R$ %.2f%n", custoFinal);

        scanner.close();
    }
}
