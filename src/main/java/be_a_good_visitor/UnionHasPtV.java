package be_a_good_visitor;

class UnionHasPtV extends HasPtV implements UnionVistorInterface {
  private ShapeD s;
  private ShapeD t;

  UnionHasPtV(PointD p) {
    super(p);
  }

  // 这里的覆盖是为了改变 父类 HasPtV 中的 forTrans 的行为，毕竟我们没有覆盖它本身
  // 只通过覆盖此 newHasPt, 间接的改变了 forTrans 在 UnionHasPtV 中的意义。
  @Override
  ShapeDVisitorInterface newHasPt(PointD p) {
    UnionHasPtV unionHasPtV = new UnionHasPtV(p);
    return unionHasPtV;
  }

  public boolean forUnion(ShapeD s, ShapeD t) {
    return s.accept(this) || t.accept(this);
  }
}
