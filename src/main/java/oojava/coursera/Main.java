package oojava.coursera;

public class Main {
    public static void main(String[] args) {

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();

        p1.adicionaIngrediente("Lombinho");
        p1.adicionaIngrediente("Pimentao");
        p1.adicionaIngrediente("Queijo Roquefort");

        p2.adicionaIngrediente("Galinha");
        p2.adicionaIngrediente("Cheddar");
        p2.adicionaIngrediente("Mucarela");
        p2.adicionaIngrediente("Carne moida");
        p2.adicionaIngrediente("Borda Recheada");
        p2.adicionaIngrediente("Batata rustica");
        p2.adicionaIngrediente("champignon");

        p3.adicionaIngrediente("Palmito");
        p3.adicionaIngrediente("Frango");
        p3.adicionaIngrediente("Cheddar");

        CarrinhoDeCompras c = new CarrinhoDeCompras();

        // Adiciona essas Pizzas em um CarrinhoDeCompra
        c.addPizza(p1);
        c.addPizza(p2);
        c.addPizza(p3);

        // Imprime o total do CarrinhoDeCompra
        System.out.println("Total de pizzas no carrinho: " +c.totalPizzas());
        System.out.println("Valor total da compra: " + c.getPrecoTotal());

        // Imprime a quantidade utilizada de cada ingrediente
        System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getListaIngredientes());

    }
}