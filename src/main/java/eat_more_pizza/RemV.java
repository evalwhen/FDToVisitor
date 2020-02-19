package eat_more_pizza;

class RemV {
  private Object o;

  RemV(Object _o) {
    o = _o;
  }

  PizzaPieD forBottom() {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD p) {
    if (o.equals(t)) {
      return p.rem(this);
    } else {
      return new Topping(t, p.rem(this));
    }
  }
}
