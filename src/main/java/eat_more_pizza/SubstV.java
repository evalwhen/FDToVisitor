package eat_more_pizza;

class SubstV implements PizzaPieVistorInterface {
  private Object n;
  private Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  public Object forBottom() {
    return new Bottom();
  }

  public Object forTopping(Object t, PizzaPieD r) {
    if (o.equals(t)) {
      return r.accept(this);
    } else {
      return new Topping(t, (PizzaPieD) r.accept(this));
    }
  }
}
