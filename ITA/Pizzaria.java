import java.util.ArrayList;
import java.util.HashMap;

public class Pizzaria {
    
    static class Pizza {
        ArrayList<String> ingredientes = new ArrayList<>();
        static HashMap<String, Integer> ingredientesUsados = new HashMap<>();

        void adicionaIngrediente(String ingrediente) {
            ingredientes.add(ingrediente);
            contabilizaIngrediente(ingrediente);
        }

        static void contabilizaIngrediente(String ingrediente) {
            if (ingredientesUsados.containsKey(ingrediente)) {
                int quantidade = ingredientesUsados.get(ingrediente);
                ingredientesUsados.put(ingrediente, quantidade + 1);
            } else {
                ingredientesUsados.put(ingrediente, 1);
            }
        }

        int getPreco() {
            int qtd = ingredientes.size();
            if (qtd <= 2) return 15;
            else if (qtd <= 5) return 20;
            else return 23;
        }

        boolean temIngredientes() {
            return ingredientes.size() > 0;
        }
    }

    static class CarrinhoDeCompras {
        ArrayList<Pizza> pizzas = new ArrayList<>();

        void adicionaPizza(Pizza pizza) {
            if (pizza.temIngredientes()) {
                pizzas.add(pizza);
            } else {
                System.out.println("Não é possível adicionar uma pizza sem ingredientes");
            }
        }

        int getValorTotal() {
            int total = 0;
            for (Pizza p : pizzas) {
                total += p.getPreco();
            }
            return total;
        }

        public static void main(String[] args) {
            Pizza p1 = new Pizza();
            p1.adicionaIngrediente("Queijo");
            p1.adicionaIngrediente("Tomate");

            Pizza p2 = new Pizza();
            p2.adicionaIngrediente("Presunto");
            p2.adicionaIngrediente("Queijo");
            p2.adicionaIngrediente("Azeitona");

            Pizza p3 = new Pizza();
            p3.adicionaIngrediente("Frango");
            p3.adicionaIngrediente("Milho");
            p3.adicionaIngrediente("Catupiry");
            p3.adicionaIngrediente("Bacon");
            p3.adicionaIngrediente("Cebola");
            p3.adicionaIngrediente("Ervilha");

            CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
            carrinho.adicionaPizza(p1);
            carrinho.adicionaPizza(p2);
            carrinho.adicionaPizza(p3);

            System.out.println("Total do carrinho: R$ " + carrinho.getValorTotal());

            System.out.println("\nIngredientes usados:");
            for (String ingrediente : Pizza.ingredientesUsados.keySet()) {
                int qtd = Pizza.ingredientesUsados.get(ingrediente);
                System.out.println(ingrediente + ": " + qtd);
            }

        }
    }
}
