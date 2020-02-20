package be_a_good_visitor;

abstract class ShapeD {
  abstract boolean accept(ShapeDVisitorInterface ask);
}

class Circle extends ShapeD {
  int r;

  public Circle(int r) {
    this.r = r;
  }

  boolean accept(ShapeDVisitorInterface ask) {
    return ask.forCircle(r);
  }
}

class Square extends ShapeD {
  int s;

  public Square(int s) {
    this.s = s;
  }

  boolean accept(ShapeDVisitorInterface ask) {
    return ask.forSquare(s);
  }
}

class Trans extends ShapeD {
  PointD q;
  ShapeD s;

  public Trans(PointD q, ShapeD s) {
    this.q = q;
    this.s = s;
  }

  boolean accept(ShapeDVisitorInterface ask) {
    return ask.forTrans(q, s);
  }
}
