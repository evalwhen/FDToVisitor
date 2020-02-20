package son_like_father;

class IntEvalV extends EvalD {

  Object plus(Object l, Object r) {
    return new Integer(((Integer) l).intValue() + ((Integer) r).intValue());
  }

  Object diff(Object l, Object r) {

    return new Integer(((Integer) l).intValue() - ((Integer) r).intValue());
  }

  Object prod(Object l, Object r) {
    return new Integer(((Integer) l).intValue() * ((Integer) r).intValue());
  }
}
