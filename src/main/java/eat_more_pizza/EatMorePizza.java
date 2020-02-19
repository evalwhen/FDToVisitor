package eat_more_pizza;

abstract class PizzaPieD {
  RemV roFn = new RemV();
  SubstV soFn = new SubstV();

  abstract PizzaPieD Rem(Object o);

  abstract PizzaPieD subst(Object n, Object o);
}

class Bottom extends PizzaPieD {

  PizzaPieD Rem(Object o) {
    return roFn.forBottom(o);
  }

  PizzaPieD subst(Object n, Object o) {
    return soFn.forBottom(n, o);
  }
}

class Topping extends PizzaPieD {
  private Object t;
  private PizzaPieD r;

  Topping(Object _t, PizzaPieD _r) {
    t = _t;
    r = _r;
  }

  PizzaPieD Rem(Object o) {
    return roFn.forTopping(t, r, o);
  }

  PizzaPieD subst(Object n, Object o) {
    return soFn.forTopping(t, r, n, o);
  }
}

public class EatMorePizza {
  public static void main(String[] args) {
    PizzaPieD p =
      new Topping(
        new Salmon(),
        new Topping(
          new Anchovy(),
          new Bottom()
        )
      );

    p.subst(new Tuna(), new Anchovy());
  }
}
