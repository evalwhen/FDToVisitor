package eat_shishd_vistor;

// That's what we are about to do. We are
// going to separate the action from the
// datatype.

class OnlyOnionsV {
    boolean forSkewer() {
        return true; }

    boolean forOnion(ShishD s) {
        return s.onlyOnions(); }

    boolean forLamb(ShishD s) {
        return false; }

    boolean forTomato(ShishD s) {
        return false; }
}

abstract class ShishD {
  OnlyOnionsV ooFn = new OnlyOnionsV();

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
    return ooFn.forOnion(s);
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
    return ooFn.forLamb(s);
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
//    return false;
    return ooFn.forOnion(s);
  }

  boolean isVegetarian() {
    return s.isVegetarian();
  }
  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }

}

public class EatShishDVistor {
  public static void main(String[] args) {
  }
}
