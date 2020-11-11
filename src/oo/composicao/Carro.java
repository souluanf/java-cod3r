package oo.composicao;

public class Carro {

	final Motor motor;
	
	Carro() {
		// Relação bidirecional: um carro tem um motor \
		// e esse motor pertence a um carro
		this.motor = new Motor(this);
	}
	
	void acelerar() {
		if (motor.fatorInjecao < 2.6)
			motor.fatorInjecao += 0.4;
	}
	
	void frear() {
		if (motor.fatorInjecao > 0.5)
			motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
