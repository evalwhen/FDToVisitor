package eat_more_pizza;

// 实际上是一个 Closure
class MutationSubstV implements MutationPieVistorInterface {
  private Object n;
  private Object o;

  public MutationSubstV(Object n, Object o) {
    this.n = n;
    this.o = o;
  }

  public Object forBottom(Bottom that) {
    return that;
  }

  public Object forTopping(Topping that) {
    if (o.equals(that.t)) {
      that.t = n;
      that.r.acceptM(this);

      return that;
    } else {
      that.r.acceptM(this);

      return that;
    }
  }
}
