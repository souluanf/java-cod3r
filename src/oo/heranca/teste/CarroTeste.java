package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {
        Civic c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);
        c1.acelerar();
        System.out.println(c1);

        System.out.println();

        Ferrari c2 = new Ferrari(415);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);
        c2.acelerar();
        System.out.println(c2);


    }
}
