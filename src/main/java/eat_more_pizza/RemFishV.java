package eat_more_pizza;

class RemFishV {
  PizzaPieD forBottom(FishD f) {
    return new Bottom();
  }

  PizzaPieD ForTopping(Object t, PizzaPieD r, FishD f) {
    if (f.equals(t)) {
      return r.remFish(f);
    } else {
      return new Topping(t, r.remFish(f));
    }
  }
}
