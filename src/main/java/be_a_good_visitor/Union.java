package be_a_good_visitor;

class Union extends ShapeD {
  private ShapeD s;
  private ShapeD t;

  Union(ShapeD s, ShapeD t) {
    this.s = s;
    this.t = t;
  }

  boolean accept(ShapeDVisitorInterface ask) {
    return ((UnionVistorInterface) ask).forUnion(s, t);
  }
}
