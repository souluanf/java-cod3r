package generics;

public class CaixaNumeroTeste {
    public static void main(String[] args) {
        CaixaNumero<Double> caixaA = new CaixaNumero<>();
        caixaA.guardar(2.13);
        double coisaA = caixaA.abrir();
        System.out.println(coisaA);

        CaixaNumero<Integer> caixaB = new CaixaNumero<>();
        caixaB.guardar(1234);
        int coisaB = caixaB.abrir();
        System.out.println(coisaB);
    }
}
