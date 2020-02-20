package be_a_good_visitor;

public class ShadowedManhattanPt extends ManhattanPt {

  int dx;
  int dy;

  public ShadowedManhattanPt(int x, int y, int dx, int dy) {
    super(x, y);
    this.dx = dx;
    this.dy = dy;
  }

  @Override
  int distanceToO() {
    return super.distanceToO() + dx + dy;
  }
}
