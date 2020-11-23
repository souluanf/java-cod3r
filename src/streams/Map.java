package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    /**
     *  Map é uma função onde eu transformo uma strem de dados em uma outra stream de dados de mesmo tamanho,
     *      com os dados ja atualizados, ou seja, já mapeados.
     *
     * QUal a regra para mapear esses dados ?
     * A regra é a expressão. Que pode ser uam funão, uma lambda
     *
     */

    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

//        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//        UnaryOperator<String> grito = n -> n + "!!! ";

//        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("BMW"));
        System.out.println("\n\nUsando composição...\n");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(primeiraLetra)
                .map(Utilitarios::grito) // Method Reference
                .forEach(print);


    }
}
