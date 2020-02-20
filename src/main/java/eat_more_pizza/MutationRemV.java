package eat_more_pizza;

class MutationRemV implements MutationPieVistorInterface {
  private Object o;

  public MutationRemV(Object o) {
    this.o = o;
  }

  public Object forBottom(Bottom that) {
    return that;
  }

  public Object forTopping(Topping that) {
    if (o.equals(that.t)) {
      return that.r.acceptM(this);
    } else {
      return new Topping(that.t, (PizzaPieD) that.r.acceptM(this));
    }
  }
}
