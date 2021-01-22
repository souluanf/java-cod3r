package generics;

public class Caixa<T> {
    // T -> definição de Generics que dei, sendo qualquer nome que eu definir

    private T coisa;

    public void guardar(T coisa){
        this.coisa = coisa;
    }

    public T abrir(){
        return coisa;
    }
}
