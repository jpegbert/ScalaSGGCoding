package chapter17

import chapter17.decorator.coffeebar.Drink
import chapter17.decorator.coffeebar.mydecorator.Decorator


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
