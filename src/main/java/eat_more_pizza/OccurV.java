package eat_more_pizza;

class OccurV implements PizzaPieVistorInterface {
  Object a;

  public OccurV(Object a) {
    this.a = a;
  }

  public Object forBottom() {
    return new Integer(0);
  }

  public Object forTopping(Object t, PizzaPieD r) {
    if (a.equals(t)) {
      return ((Integer) r.accept(this)).intValue() + 1;
    } else {
      return r.accept(this);
    }
  }
}
