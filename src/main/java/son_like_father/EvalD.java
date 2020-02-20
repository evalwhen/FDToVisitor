package son_like_father;

abstract class EvalD implements ExprVisitorI {
  public Object forPlus(ExprD l, ExprD r) {
    return plus(l.accept(this), r.accept(this));
  }

  public Object forDiff(ExprD l, ExprD r) {
    return diff(l.accept(this), r.accept(this));
  }

  public Object forProd(ExprD l, ExprD r) {
    return prod(l.accept(this), r.accept(this));
  }

  public Object forConst(Object c) {
    return c;
  }

  abstract Object plus(Object l, Object r);

  abstract Object diff(Object l, Object r);

  abstract Object prod(Object l, Object r);
}
