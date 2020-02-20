package eat_more_pizza;

class MutationOccurV implements MutationPieVistorInterface {
  private Object o;

  public MutationOccurV(Object o) {
    this.o = o;
  }

  public Object forBottom(Bottom that) {
    return new Integer(0);
  }

  public Object forTopping(Topping that) {
    if (o.equals(that.t)) {
      return 1 + (Integer) that.r.acceptM(this);
    } else {
      return that.r.acceptM(this);
    }
  }
}
