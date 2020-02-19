package eat_pizza_vistor;

class SubAbCV {
  PizzaD forAnchovy(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forCheese(PizzaD p) {
    return new Cheese(p.subAbC());
  }

  PizzaD forCrust() {
    return new Crust();
  }

  PizzaD forOlive(PizzaD p) {
    return new Olive(p.subAbC());
  }

  PizzaD forSausage(PizzaD p) {
    return new Sausage(p.subAbC());
  }
}
