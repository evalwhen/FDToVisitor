package eat_more_pizza;

class RemIntV {
  PizzaPieD forBottom(Integer i) {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD r, Integer i) {
    if (i.equals(t)) {
      return r.remInt(i);
    } else {
      return new Topping(t, r.remInt(i));
    }
  }
}
