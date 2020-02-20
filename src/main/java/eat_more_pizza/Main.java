package eat_more_pizza;

abstract class PizzaPieD {
  //  abstract PizzaPieD rem(PizzaPieVistorInterface pv);
//
//  abstract PizzaPieD subst(PizzaPieVistorInterface pv);
  abstract Object accept(PizzaPieVistorInterface ask);

  abstract Object acceptM(MutationPieVistorInterface ask);
}

class Bottom extends PizzaPieD {
  Object accept(PizzaPieVistorInterface ask) {
    return ask.forBottom();
  }

  Object acceptM(MutationPieVistorInterface ask) {
    return ask.forBottom(this);
  }
}

class Topping extends PizzaPieD {
  Object t;
  PizzaPieD r;

  Topping(Object _t, PizzaPieD _r) {
    t = _t;
    r = _r;
  }

  Object accept(PizzaPieVistorInterface ask) {
    return ask.forTopping(t, r);
  }

  Object acceptM(MutationPieVistorInterface ask) {
    return ask.forTopping(this);
  }
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
