package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
//        Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        Set<Integer> nums = new HashSet<>();

        nums.add(1);
        nums.add(2);
        nums.add(120);
        nums.add(6);
        for (Integer num : nums) {
            System.out.println(num);
        }

        long tempoFinal = System.currentTimeMillis();
        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d);
    }
}
