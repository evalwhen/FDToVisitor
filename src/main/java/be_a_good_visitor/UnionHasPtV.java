package be_a_good_visitor;

class UnionHasPtV extends HasPtV implements UnionVistorInterface {
  public UnionHasPtV(PointD p) {
    super(p);
  }

  @Override
  ShapeDVisitorInterface newHasPt(PointD p) {
    return new UnionHasPtV(p);
  }

  public boolean forUnion(ShapeD s, ShapeD t) {
    return s.accept(this) || t.accept(this);
  }
}
