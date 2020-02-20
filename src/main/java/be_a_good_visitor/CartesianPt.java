package be_a_good_visitor;

class CartesianPt extends PointD {
  CartesianPt(int x, int y) {
    super(x, y);
  }

  int distanceToO() {
    return (int) Math.sqrt(x * x + y * y);
  }
}
