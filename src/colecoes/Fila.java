package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //Offrer e Add -> Adicionam elemtnos na fila
        // Diferença é o comportamento  quando a fila está cheia!
        fila.add("Ana"); //Retorna falso
        fila.offer("Bia"); //Lança exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        //Peek e Element -> Obter próximo elemento da fila sem remover
        // Diferença é o comportamento  quando a fila está vazia!
        System.out.println(fila.peek()); //retorna Falso
        System.out.println(fila.peek()); //Lança exceção
        System.out.println(fila.element());
        System.out.println(fila.element());

        //Poll e Remove -> Obter próximo elemento da fila e remove
        // Diferença é o comportamento  quando a fila está vazia!
        System.out.println(fila.poll()); //retorna Falso
        System.out.println(fila.remove()); //Lança exceção
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());

//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains();

    }
}
