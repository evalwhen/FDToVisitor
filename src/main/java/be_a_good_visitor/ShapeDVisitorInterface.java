package be_a_good_visitor;

interface ShapeDVisitorInterface {
  boolean forCircle(int r);

  boolean forSquare(int s);

  boolean forTrans(PointD q, ShapeD s);
}

