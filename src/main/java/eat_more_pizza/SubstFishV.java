package eat_more_pizza;

class SubstFishV {
  PizzaPieD forBottom(FishD n, FishD o) {
    return new Bottom();
  }

  PizzaPieD forTopping(Object t, PizzaPieD r, FishD n, FishD o) {
    if (o.equals(t)) {
      return r.substFish(n, o);
    } else {
      return new Topping(t, r.substFish(n, o));
    }
  }
}
