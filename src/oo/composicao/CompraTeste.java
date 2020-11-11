package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        /*
        * Relacionamento bidirecional
        */
        Compra compra1 = new Compra();
        compra1.cliente = "João Pedro";

        compra1.adicionarItem("Caneta",20,7.45);
        compra1.adicionarItem(new Item("Borracha",12,3.89));
        compra1.adicionarItem(new Item("Caderno",3,18.79));

        System.out.println(compra1.items.size());
        System.out.println(compra1.getValorTotal());

        // Só para mostrar a navegação bidirecional
        double total = compra1.items.get(0).compra.items.get(1).compra.getValorTotal();
        System.out.printf("O total é %.2f",total);
    }
}
