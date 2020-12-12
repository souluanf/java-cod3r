package excecao;

public class ChecadaVSNaoChecada {
    public static void main(String[] args) {
        /**  Exception -> Raiz de todas exceções no Java
         *  RuntimeException é uma classe especial, pois qualquer classe que herde dele é conhecida como não checada
         *  e não precisa ser tratado.
         */

        try {
            geraErro1();
        } catch (RuntimeException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Fim :)");
    }

    // Exceção NÃO checada / NÃO verificada
    static void geraErro1(){
        throw  new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // Exceção checada / verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02");
    }
}
