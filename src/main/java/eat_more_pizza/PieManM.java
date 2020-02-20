package eat_more_pizza;

// 这里的 M 表示该 class 管理着一个状态
public class PieManM implements PieManI {
  PizzaPieD p = new Bottom();

  public int addTop(Object t) {
    p = new Topping(t, p)
    ;
    return occTop(t);
  }

  public int remTop(Object t) {
    p = (PizzaPieD) p.accept(new RemV(t))
    ;
    return occTop(t);
  }

  public int substTop(Object n, Object o) {
    p = (PizzaPieD) p.accept(new SubstV(n, o))
    ;
    return occTop(n);
  }

  public int occTop(Object o) {
    return ((Integer) p.accept(new OccurV(o))).intValue();
  }
}
