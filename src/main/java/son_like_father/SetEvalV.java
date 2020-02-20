package son_like_father;

class SetEvalV extends EvalD {
  @Override
  Object plus(Object l, Object r) {
    return ((SetD) l).plus((SetD) r);
  }

  @Override
  Object diff(Object l, Object r) {
    return ((SetD) l).diff((SetD) r);
  }

  @Override
  Object prod(Object l, Object r) {
    return ((SetD) l).prod((SetD) r);
  }
}
