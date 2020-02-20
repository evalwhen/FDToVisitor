package be_a_good_visitor;

class HasPtV implements ShapeDVisitorInterface {
  private PointD p;

  HasPtV(PointD p) {
    this.p = p;
  }

  ShapeDVisitorInterface newHasPt(PointD p) {
    return new HasPtV(p);
  }

  public boolean forCircle(int r) {
    return p.distanceToO() <= r;
  }

  public boolean forSquare(int s) {
    return p.x <= s && p.y <= s;
  }

  public boolean forTrans(PointD q, ShapeD s) {
    return s.accept(newHasPt(p.minus(q)));
  }
}
