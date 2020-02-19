package eat_more_pizza;

abstract class FishD {
}

class Anchovy extends FishD {
  @Override
  public boolean equals(Object o) {
    return (o instanceof Anchovy);
  }
}

class Salmon extends FishD {
  @Override
  public boolean equals(Object o) {
    return (o instanceof Salmon);
  }
}

class Tuna extends FishD {
  @Override
  public boolean equals(Object o) {
    return (o instanceof Tuna);
  }
}
