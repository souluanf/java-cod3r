package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Heroi heroi = new Heroi(10, 10);
		Monstro monstro = new Monstro(11, 11);
		
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
		System.out.println("Her�i ataca Monstro: " + heroi.atacar(monstro));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
				
		System.out.println("Her�i anda para SUL: " + heroi.andar(Direcao.SUL));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
		System.out.println("Her�i ataca Monstro: " + heroi.atacar(monstro));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();

		System.out.println("Monstro ataca Her�i: " + monstro.atacar(heroi));
		System.out.println("Heroi:   " + heroi.x + " " + heroi.y + " " + heroi.vida);
		System.out.println("Monstro: " + monstro.x + " " + monstro.y + " " + monstro.vida);
		System.out.println();
		
	}
}
