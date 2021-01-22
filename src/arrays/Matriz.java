package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("QUantos alunos? ");
        int qtdeALunos = scanner.nextInt();

        System.out.println("Quantas notas por alunos? ");
        int qtdeNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtdeALunos][qtdeNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d", (n + 1), (a + 1));
                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];

            }
        }
        double media = total / (qtdeALunos * qtdeNotas);
        System.out.println("Média da turma é: " + media);

        for (double[] notasDoAluno : notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }

        scanner.close();

    }
}
