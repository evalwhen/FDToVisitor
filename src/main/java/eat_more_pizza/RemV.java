package eat_more_pizza;

class RemV implements PizzaPieVistorInterface {
  private Object o;

  RemV(Object _o) {
    o = _o;
  }

  public PizzaPieD forBottom() {
    return new Bottom();
  }

  public PizzaPieD forTopping(Object t, PizzaPieD p) {
    if (o.equals(t)) {
      return p.accept(this);
    } else {
      return new Topping(t, p.accept(this));
    }
  }
}
