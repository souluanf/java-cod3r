package generics;

import java.util.List;

public class ListaUtil {

    // Sem generics
    public static Object getUltimo1(List<?> lista) {
        return lista.get(lista.size() - 1);
    }

    // Com Generics
    public static <T> T getUltimo2(List<T> lista) {
        return lista.get(lista.size() - 1);
    }
}
