package be_a_good_visitor;

class ManhattanPt extends PointD {
  ManhattanPt(int x, int y) {
    super(x, y);
  }

  int distanceToO() {
    return x + y;
  }
}
