package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(2, "Teclado", 20.3);
		compra1.adicionarItem(1, "Mesa", 463.8);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem(3, "Mouse", 10.5);
		compra2.adicionarItem(1, "Computador", 6999.99);
		
		Cliente cliente = new Cliente("Joao Pedro");
		cliente.comprar(compra1);
		cliente.comprar(compra2);
		
		System.out.println("Cliente ......: " + cliente.nome);
		System.out.println();
		cliente.exibirCompras();
		System.out.printf("Total gasto ..: R$ %.2f\n", cliente.obterValorTotal());
	}
}
