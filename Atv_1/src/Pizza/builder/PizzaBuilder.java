package Pizza.builder;

import Pizza.entidades.Pizza;

public class PizzaBuilder {

    private Pizza pizza = new Pizza();

    public PizzaBuilder setTamanho(String tamanho) {
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder setBorda(String borda) {
        this.pizza.setBorda(borda);
        return this;
    }

    public PizzaBuilder setRecheio_1(String recheio_1) {
        this.pizza.setRecheio_1(recheio_1);
        return this;
    }

    public PizzaBuilder setRecheio_2(String recheio_2) {
        this.pizza.setRecheio_2(recheio_2);
        return this;
    }

    public Pizza build (){
        return this.pizza;
    }



}
