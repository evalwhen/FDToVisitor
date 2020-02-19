package eat_more_pizza;

abstract class PizzaPieD {
  abstract PizzaPieD rem(RemV roFn);

  abstract PizzaPieD subst(SubstV soFn);
}

class Bottom extends PizzaPieD {

  PizzaPieD rem(RemV roFn) {
    return roFn.forBottom();
  }

  PizzaPieD subst(SubstV soFn) {
    return soFn.forBottom();
  }
}

class Topping extends PizzaPieD {
  private Object t;
  private PizzaPieD r;

  Topping(Object _t, PizzaPieD _r) {
    t = _t;
    r = _r;
  }

  PizzaPieD rem(RemV roFn) {
    return roFn.forTopping(t, r);
  }

  PizzaPieD subst(SubstV soFn) {
    return soFn.forTopping(t, r);
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

    p.subst(new SubstV(new Tuna(), new Anchovy()));
  }
}
