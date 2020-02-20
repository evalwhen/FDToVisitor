package son_like_father;

public class Add extends SetD {
  private Integer i;
  private SetD s;

  Add(Integer i, SetD s) {
    this.i = i;
    this.s = s;
  }

  protected boolean mem(Integer n) {
    if (i.equals(n)) {
      return true;
    } else {
      return s.mem(n);
    }
  }

  SetD plus(SetD t) {
    return s.plus(t.add(i));
  }

  SetD diff(SetD t) {
    if (t.mem(i)) {
      return s.diff(t);
    } else {
      return s.diff(t).add(i);
    }
  }

  SetD prod(SetD t) {
    if (t.mem(i)) {
      return s.prod(t).add(i);
    } else {
      return s.prod(t);
    }
  }
}
