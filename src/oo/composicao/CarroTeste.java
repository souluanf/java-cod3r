package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		System.out.println("Está ligado? " + carro1.estaLigado());
		System.out.println();
		
		carro1.ligar();
		System.out.println("Está ligado? " + carro1.estaLigado());
		System.out.println();
		
		System.out.println("Rotações: " + carro1.motor.giros());
		System.out.println();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		System.out.println("Rotações: " + carro1.motor.giros());
		System.out.println();
		
		carro1.frear();
		carro1.frear();
		System.out.println("Rotações: " + carro1.motor.giros());
		System.out.println();
		
		// Graças a relação bidirecional é possível fazer:
		System.out.println("Rotações: " + carro1.motor.carro.motor.carro.motor.giros());
		
		
		// Falta encapsulamento, pois não poderia ser possível alterar:
		// carro.motor.fatorInjecao = -30
	}
}
