package eat_pizza_vistor;

abstract class PizzaD {
  RemAV remFn = new RemAV();
  TopAwCV topFn = new TopAwCV();
  SubAbCV subFn = new SubAbCV();

  abstract PizzaD remA();
  abstract PizzaD topAwC();
  abstract PizzaD subAbC();
}

class Crust extends PizzaD {
  @java.lang.Override
  public java.lang.String toString() {
    return "new " + getClass().getName() + "()";
  }

  PizzaD remA() {
    return new Crust();
  }

  PizzaD topAwC() {
    return new Crust();
  }

  PizzaD subAbC() {
//    return new Crust();
    return subFn.forCrust();
  }
}

class Cheese extends PizzaD {
  private PizzaD p;
  Cheese(PizzaD _p) {
    p = _p;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + p + ")";
  }
  PizzaD remA() {
    return new Cheese(p.remA());
  }

  @java.lang.Override
  PizzaD topAwC() {
    return new Cheese(p.topAwC());
  }

  @java.lang.Override
  PizzaD subAbC() {
//    return new Cheese(p.subAbC());
    return subFn.forCheese(p);
  }
}

class Olive extends PizzaD {
  private PizzaD p;
  Olive(PizzaD _p) {
    p = _p;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + p + ")";
  }

  @java.lang.Override
  PizzaD remA() {
    return new Olive(p.remA());
  }

  @java.lang.Override
  PizzaD topAwC() {
    return new Olive(p.topAwC());
  }

  @java.lang.Override
  PizzaD subAbC() {
//    return new Olive(p.subAbC());
    return subFn.forOlive(p);
  }
}

class Anchovy extends PizzaD {
  private PizzaD p;
  Anchovy(PizzaD _p) {
    p = _p;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + p + ")";
  }
  PizzaD remA() {
    return p.remA();
  }

  @java.lang.Override
  PizzaD topAwC() {
    return new Cheese(p.topAwC());
  }

  @java.lang.Override
  PizzaD subAbC() {
//    return new Cheese(p.subAbC());
    return subFn.forAnchovy(p);
  }
}

class Sausage extends PizzaD {
  private PizzaD p;
  Sausage(PizzaD _p) {
    p = _p;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + p + ")";
  }

  PizzaD remA() {
    return new Sausage(p.remA());
  }

  @java.lang.Override
  PizzaD topAwC() {
    return new Sausage(p.topAwC());
  }

  @java.lang.Override
  PizzaD subAbC() {
    return new Sausage(p.subAbC());
  }

}
public class EatPizzaByVistor {
  public static void main(String[] args) {
  }
}
