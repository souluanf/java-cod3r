package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		
		System.out.println("Est� ligado? " + carro1.estaLigado());
		System.out.println();
		
		carro1.ligar();
		System.out.println("Est� ligado? " + carro1.estaLigado());
		System.out.println();
		
		System.out.println("Rota��es: " + carro1.motor.giros());
		System.out.println();
		
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		carro1.acelerar();
		
		System.out.println("Rota��es: " + carro1.motor.giros());
		System.out.println();
		
		carro1.frear();
		carro1.frear();
		System.out.println("Rota��es: " + carro1.motor.giros());
		System.out.println();
		
		// Gra�as a rela��o bidirecional � poss�vel fazer:
		System.out.println("Rota��es: " + carro1.motor.carro.motor.carro.motor.giros());
		
		
		// Falta encapsulamento, pois n�o poderia ser poss�vel alterar:
		// carro.motor.fatorInjecao = -30
	}
}
