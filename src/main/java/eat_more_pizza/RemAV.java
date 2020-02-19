package eat_more_pizza;

class RemAV {
  PizzaPieD forBottom() {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD r) {
    if (new Anchovy().equals(t)) {
      return r.remA();
    } else {
      return new Topping(t, r.remA());
    }
  }
}
