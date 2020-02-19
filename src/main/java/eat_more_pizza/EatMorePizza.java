package eat_more_pizza;

abstract class PizzaPieD {
  RemAV remFn = new RemAV();
  RemFishV rfFn = new RemFishV();
  RemIntV riFn = new RemIntV();
  RemV roFn = new RemV();

  SubstFishV sfFn = new SubstFishV();
  SubstV soFn = new SubstV();

  abstract PizzaPieD remA();

  abstract PizzaPieD remFish(FishD f);

  abstract PizzaPieD remInt(Integer i);

  abstract PizzaPieD Rem(Object o);

  abstract PizzaPieD substFish(FishD n, FishD o);

  abstract PizzaPieD subst(Object n, Object o);
}

class Bottom extends PizzaPieD {
  PizzaPieD remA() {
    return remFn.forBottom();
  }

  PizzaPieD remFish(FishD f) {
    return rfFn.forBottom(f);
  }

  public PizzaPieD remInt(Integer i) {
    return riFn.forBottom(i);
  }

  PizzaPieD Rem(Object o) {
    return roFn.forBottom(o);
  }

  PizzaPieD substFish(FishD n, FishD o) {
    return sfFn.forBottom(n, o);
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

  PizzaPieD remA() {
    return remFn.forTopping(t, r);
  }

  PizzaPieD remFish(FishD f) {
    return rfFn.ForTopping(t, r, f);
  }

  public PizzaPieD remInt(Integer i) {
    return riFn.forTopping(t, r, i);
  }

  PizzaPieD Rem(Object o) {
    return roFn.forTopping(t, r, o);
  }

  PizzaPieD substFish(FishD n, FishD o) {
    return sfFn.forTopping(t, r, n, o);
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

    p.substFish(new Tuna(), new Anchovy());
  }
}
