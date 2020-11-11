package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        int qtdNotas = sc.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double total = 0;
        for (double nota : notas) {
            total += nota;
        }

        System.out.println("A média é : " + (total / notas.length));
        sc.close();
    }
}
