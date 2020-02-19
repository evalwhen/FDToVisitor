package eat_more_pizza;

class RemV {
  PizzaPieD forBottom(Object o) {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD p, Object o) {
    if (o.equals(t)) {
      return p.Rem(o);
    } else {
      return new Topping(t, p.Rem(o));
    }
  }
}
