package oo.composicao;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	String cliente;
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	double obterPrecoTotal() {
		double soma = 0;
		for (Item i: itens)
			soma += i.quantidade * i.preco;
		return soma;
	}
}
