package oojava.coursera;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private final ArrayList<Pizza> pizzas = new ArrayList<>();
    private double precoTotal = 0.0;

    public CarrinhoDeCompras() {
    }

    public void addPizza(Pizza p) {
        if (!p.getIngrediente().isEmpty()) {
            this.pizzas.add(p);
        }

    }

    public int totalPizzas() {
        return this.pizzas.size();
    }

    public double getPrecoTotal() {
        for (Pizza pizza : this.pizzas) {
            this.precoTotal += pizza.getPreco();
        }

        return this.precoTotal;
    }
}
