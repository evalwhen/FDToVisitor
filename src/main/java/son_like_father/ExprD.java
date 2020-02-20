package son_like_father;

abstract class ExprD {
  abstract Object accept(ExprVisitorI ask);
}

class Plus extends ExprD {
  private ExprD l;
  private ExprD r;

  public Plus(ExprD l, ExprD r) {
    this.l = l;
    this.r = r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forPlus(l, r);
  }
}

class Diff extends ExprD {
  private ExprD l;
  private ExprD r;

  public Diff(ExprD l, ExprD r) {
    this.l = l;
    this.r = r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forDiff(l, r);
  }
}

class Prod extends ExprD {
  private ExprD l;
  private ExprD r;

  public Prod(ExprD l, ExprD r) {
    this.l = l;
    this.r = r;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forProd(l, r);
  }
}

class Const extends ExprD {
  private Object c;

  public Const(Object c) {
    this.c = c;
  }

  Object accept(ExprVisitorI ask) {
    return ask.forConst(c);
  }
}
