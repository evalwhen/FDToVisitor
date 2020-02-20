package son_like_father;

class Empty extends SetD {
  protected boolean mem(Integer i) {
    return false;
  }

  SetD plus(SetD s) {
    return s;
  }

  SetD diff(SetD s) {
    return new Empty();
  }

  SetD prod(SetD s) {
    return new Empty();
  }
}
