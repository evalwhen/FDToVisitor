package son_like_father;

// (* (+ 7 5) (- 6 2))
public class SonLikeFather {
  public static void main(String[] args) {
    ExprD expr =
      new Prod(
        new Plus(
          new Const(new Integer(7)),
          new Const(new Integer(5))),
        new Diff(
          new Const(new Integer(6)),
          new Const(new Integer(2))
        ));

    System.out.println(expr.accept(new IntEvalV()));

    ExprD exprSet =
      new Prod(
        new Const(new Empty().add(new Integer(7))),
        new Const(new Empty().add(new Integer(3))));

    System.out.println(exprSet.accept(new SetEvalV()));
  }
}

