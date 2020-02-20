package be_a_good_visitor;

abstract class PointD {
  int x;
  int y;

  PointD(int x, int y) {
    this.x = x;
    this.y = y;
  }

  boolean closerToO(PointD p) {
    return distanceToO() <= p.distanceToO();
  }

  PointD minus(PointD p) {
    return new CartesianPt(x - p.x, y - p.y);
  }

  abstract int distanceToO();
}
