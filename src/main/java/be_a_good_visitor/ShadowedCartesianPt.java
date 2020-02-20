package be_a_good_visitor;

class ShadowedCartesianPt extends CartesianPt {
  private int dx;
  private int dy;

  public ShadowedCartesianPt(int x, int y, int dx, int dy) {
    super(x, y);
    this.dx = dx;
    this.dy = dy;
  }

  @Override
  int distanceToO() {
    return new CartesianPt(x + dx, y + dy).distanceToO();
  }
}
