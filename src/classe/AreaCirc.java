package classe;

public class AreaCirc {
    double raio;
    static double PI = 3.14;

    public AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio,2);
    }
}
