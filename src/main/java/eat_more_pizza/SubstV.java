package eat_more_pizza;

class SubstV {
  private Object n;
  private Object o;

  SubstV(Object _n, Object _o) {
    n = _n;
    o = _o;
  }

  PizzaPieD forBottom() {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD r) {
    if (o.equals(t)) {
      return r.subst(this);
    } else {
      return new Topping(t, r.subst(this));
    }
  }
}
