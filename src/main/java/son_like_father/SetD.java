package son_like_father;

import java.util.Set;

abstract class SetD {
  SetD add(Integer i) {
    if (mem(i)) {
      return this;
    } else {
      return new Add(i, this);
    }
  }

  protected abstract boolean mem(Integer i);

  abstract SetD plus(SetD s);

  abstract SetD diff(SetD s);

  abstract SetD prod(SetD s);
}

