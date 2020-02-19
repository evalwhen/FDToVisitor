package eat_shishd_vistor;

// That's what we are about to do. We are
// going to separate the action from the
// datatype.

class OnlyOnionsV implements ShishVistorInterface {
  public boolean forSkewer() {
    return true;
  }

  // s, which is the rest of the shish.
  public boolean forOnion(ShishD s) {
    // 是否 onion 下面的 shish 对一个 onion 爱好者来说还是可以吃的
    return s.accept(this);
  }

  public boolean forLamb(ShishD s) {
    return false;
  }

  public boolean forTomato(ShishD s) {
    return false;
  }
}

class IsVegetarianV implements ShishVistorInterface {
  public boolean forSkewer() {
    return true;
  }

  public boolean forOnion(ShishD s) {
    return s.accept(this);
  }

  public boolean forLamb(ShishD s) {
    return false;
  }

  public boolean forTomato(ShishD s) {
    return s.accept(this);
  }
}

//  For us, a protocol is an agreement on
//  how classes that specify a datatype and its variants interact
//  with classes that realize functions on that datatype
abstract class ShishD {
//  OnlyOnionsV ooFn = new OnlyOnionsV();
//  IsVegetarianV ivFn = new IsVegetarianV();

  abstract boolean accept(ShishVistorInterface service);
}

class Skewer extends ShishD {
  boolean accept(ShishVistorInterface service) {
//    return true;
    return service.forSkewer();
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "()";
  }
}

class Onion extends ShishD {
  private ShishD s;

  Onion(ShishD _s) {
    s = _s;
  }

  boolean accept(ShishVistorInterface service) {
    return service.forOnion(s);
  }


  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }
}

class Lamb extends ShishD {
  private ShishD s;

  Lamb(ShishD _s) {
    s = _s;
  }

  boolean accept(ShishVistorInterface service) {
    return service.forLamb(s);
  }


  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }
}

class Tomato extends ShishD {
  private ShishD s;

  Tomato(ShishD _s) {
    s = _s;
  }

  boolean accept(ShishVistorInterface service) {
//    return false;
    return service.forTomato(s);
  }

  @Override
  public String toString() {
    return "new " + getClass().getName() + "( \n" + s + ")";
  }

}

public class EatShishDMain {
  public static void main(String[] args) {
    ShishD s =
      new Tomato(
        new Onion(
          new Lamb(
            new Onion(
              new Skewer()
            )
          )
        )
      );

    OnlyOnionsV oov = new OnlyOnionsV();
    IsVegetarianV iv = new IsVegetarianV();

    // 是否都是洋葱串
    System.out.println(s.accept(oov));
    // 是否都是蔬菜串
    System.out.println(s.accept(iv));
  }
}
