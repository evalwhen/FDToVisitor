package eat_more_pizza;

class SubstV {
  PizzaPieD forBottom(Object n, Object o) {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD r, Object n, Object o) {
    if (o.equals(t)) {
      return r.subst(n, o);
    } else {
      return new Topping(t, r.subst(n, o));
    }
  }
}
