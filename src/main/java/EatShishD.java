abstract class ShishD {
  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
    return true;
  }
  boolean isVegetarian() {
    return true;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "()";
  }
}

class Onion extends ShishD {
  ShishD s;
  Onion(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return s.onlyOnions();
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }



  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }
}

class Lamb extends ShishD {
  ShishD s;
  Lamb(ShishD _s) {
    s = _s;
  }

  boolean onlyOnions() {
    return false;
  }

  boolean isVegetarian() {
    return false;
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }
}

class Tomato extends ShishD {
  ShishD s;
  Tomato(ShishD _s) {
    s = _s;
  }
  boolean onlyOnions() {
    return false;
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }
  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }

}

public class EatShishD {
  public static void main(String[] args) {
    ShishD shishD =
      new Onion(
        new Tomato(
          new Lamb(
            new Skewer())));
    System.out.println(shishD);
    System.out.println(shishD.onlyOnions());
  }
}