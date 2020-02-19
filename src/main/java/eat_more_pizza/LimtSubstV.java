package eat_more_pizza;

class LimtSubstV implements PizzaPieVistorInterface {
  private int counter; // 限制 o 被 n 替换的次数
  private Object n; // 使用 n 替换 o
  private Object o;

  LimtSubstV(int _c, Object _n, Object _o) {
    counter = _c;
    n = _n;
    o = _o;
  }

  public PizzaPieD forBottom() {
    return new Bottom();
  }

  public PizzaPieD forTopping(Object t, PizzaPieD r) {
    if (o.equals(t)) {
      return r.accept(new LimtSubstV(counter - 1, n, o));
    } else {
      return new Topping(t, r.accept(this));
    }
  }
}
