package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Marcela", 7.1);
        Aluno a2 = new Aluno("Camila", 6.1);
        Aluno a3 = new Aluno("Alessandra", 8.1);
        Aluno a4 = new Aluno("Pamela", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = Comparator.comparingDouble(aluno -> aluno.nota);

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> Double.compare(aluno2.nota, aluno1.nota);


        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(piorNota).get());

        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }

}
