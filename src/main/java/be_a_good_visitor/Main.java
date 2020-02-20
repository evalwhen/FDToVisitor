package be_a_good_visitor;

public class Main {
  public static void main(String[] args) {
    ShapeD s =
      new Trans(
        new CartesianPt(3, 7),
        new Union(
          new Square(10),
          new Circle(10)));

    boolean x = s.accept(new UnionHasPtV(new CartesianPt(13, 17)));

    System.out.println(x);
  }
}
