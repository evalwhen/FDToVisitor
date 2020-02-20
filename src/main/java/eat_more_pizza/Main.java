package eat_more_pizza;

abstract class PizzaPieD {
  //  abstract PizzaPieD rem(PizzaPieVistorInterface pv);
//
//  abstract PizzaPieD subst(PizzaPieVistorInterface pv);
  abstract PizzaPieD accept(PizzaPieVistorInterface ask);
}

class Bottom extends PizzaPieD {
  PizzaPieD accept(PizzaPieVistorInterface ask) {
    return ask.forBottom();
  }

//  PizzaPieD rem(PizzaPieVistorInterface fn) {
//    return fn.forBottom();
//  }
//  PizzaPieD subst(PizzaPieVistorInterface fn) {
//    return fn.forBottom();
//  }
}

class Topping extends PizzaPieD {
  private Object t;
  private PizzaPieD r;

  Topping(Object _t, PizzaPieD _r) {
    t = _t;
    r = _r;
  }

  PizzaPieD accept(PizzaPieVistorInterface ask) {
    return ask.forTopping(t, r);
  }

//  PizzaPieD rem(PizzaPieVistorInterface fn) {
//    return fn.forTopping(t, r);
//  }
//
//  PizzaPieD subst(PizzaPieVistorInterface fn) {
//    return fn.forTopping(t, r);
//  }
}

public class Main {
  public static void main(String[] args) {
    PizzaPieD p =
      new Topping(
        new Salmon(),
        new Topping(
          new Anchovy(),
          new Bottom()
        )
      );

    p.accept(new SubstV(new Tuna(), new Anchovy()));

    p.accept(new LimtSubstV(1, new Tuna(), new Anchovy()));

    p.accept(new RemV(new Tuna()));
  }
}
