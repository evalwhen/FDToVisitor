package eat_more_pizza;

class RemV implements PizzaPieVistorInterface {
  private Object o;

  RemV(Object _o) {
    o = _o;
  }

  public Object forBottom() {
    return new Bottom();
  }

  public Object forTopping(Object t, PizzaPieD p) {
    if (o.equals(t)) {
      return p.accept(this);
    } else {
      return new Topping(t, (PizzaPieD) p.accept(this));
    }
  }
}
