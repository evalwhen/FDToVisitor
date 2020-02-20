package be_a_good_visitor;

interface UnionVistorInterface extends ShapeDVisitorInterface {
  boolean forUnion(ShapeD s, ShapeD t);
}
