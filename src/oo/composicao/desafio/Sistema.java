package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionaItem("Caneta",1,100);
        compra1.adicionaItem(new Produto("Notebook",2000),2);

        Compra compra2 = new Compra();
        compra2.adicionaItem("Caderno",10,10);
        compra2.adicionaItem(new Produto("Impressora",1000),1);

        Cliente cliente = new Cliente("Luan Fernandes");
        cliente.adicionarCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println(cliente.obterValorTotal());

    }
}
