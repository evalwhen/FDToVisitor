package son_like_father;

public interface ExprVisitorI {
  Object forPlus(ExprD l, ExprD r);

  Object forDiff(ExprD l, ExprD r);

  Object forProd(ExprD l, ExprD r);

  Object forConst(Object c);
}
