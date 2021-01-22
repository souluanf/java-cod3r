package oo.encapsulamento;

public class PessoaIdade {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Luan", "Fernandes", 20);
        p1.setIdade(25); // alterar valor variavel

        System.out.println(p1.getIdade()); //ler
        System.out.println(p1); //toString()

        System.out.println(p1.getNomeCompleto()); //Getter Nome Cmpleto
    }
}
