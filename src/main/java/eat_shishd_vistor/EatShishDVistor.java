package eat_shishd_vistor;

// That's what we are about to do. We are
// going to separate the action from the
// datatype.

class OnlyOnionsV {
  boolean forSkewer() {
    return true; }

  // s, which is the rest of the shish.
  boolean forOnion(ShishD s) {
    // 是否 onion 下面的 shish 对一个 onion 爱好者来说还是可以吃的
    return s.onlyOnions(); }

  boolean forLamb(ShishD s) {
    return false; }

  boolean forTomato(ShishD s) {
    return false; }
}

class IsVegetarianV {
  boolean forSkewer() {
    return true;
  }

  boolean forOnion(ShishD s) {
    return s.isVegetarian();
  }

  boolean forLamb(ShishD s) {
    return false;
  }

  boolean forTomato(ShishD s) {
    return s.isVegetarian();
  }
}

//  For us, a protocol is an agreement on
//  how classes that specify a datatype and its variants interact
//  with classes that realize functions on that datatype
abstract class ShishD {
  OnlyOnionsV ooFn = new OnlyOnionsV();
  IsVegetarianV ivFn = new IsVegetarianV();

  abstract boolean onlyOnions();
  abstract boolean isVegetarian();
}

class Skewer extends ShishD {
  boolean onlyOnions() {
//    return true;
    return ooFn.forSkewer();
  }
  boolean isVegetarian() {
//    return true;
    return ivFn.forSkewer();
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
//    return s.isVegetarian();
    // 向 ivFn 请求自己是否是素的。
    return ivFn.forOnion(s);
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
//    return false;
    return ivFn.forLamb(s);
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
    return ooFn.forTomato(s);
  }

  boolean isVegetarian() {
//    return s.isVegetarian();
    return ivFn.forTomato(s);
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
