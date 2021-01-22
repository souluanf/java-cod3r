package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> lista = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void comprar(Compra compra) {
		this.lista.add(compra);
	}
	
	double obterValorTotal() {
		double soma = 0;
		for (Compra compra: lista)
			soma += compra.obterValorTotal();
		return soma;
	}
	
	void exibirCompras() {
		for (Compra compra: lista) {
			compra.exibir();
			System.out.println();
		}
	}
}
