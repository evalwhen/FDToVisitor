abstract class PizzaD {
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
    return new Crust();
  }
}

class Cheese extends PizzaD {
  PizzaD p;
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
    return new Cheese(p.subAbC());
  }
}

class Olive extends PizzaD {
  PizzaD p;
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
    return new Olive(topAwC());
  }

  @java.lang.Override
  PizzaD subAbC() {
    return new Olive(p.subAbC());
  }
}

class Anchovy extends PizzaD {
  PizzaD p;
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
    return new Cheese(p.subAbC());
  }
}

class Sausage extends PizzaD {
  PizzaD p;
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

public class EatPizza {
  public static void main(String[] args) {
    PizzaD pizzaD =
      new Olive(
        new Anchovy(
          new Cheese(
            new Crust())));

    System.out.println(pizzaD);
    System.out.println("\n");
    System.out.println(pizzaD.subAbC());
  }

}
