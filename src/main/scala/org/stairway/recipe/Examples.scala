package org.stairway.recipe

object Apple extends Food("Apple")

object Orange extends Food("Orange")

object Cream extends Food("Cream")

object Sugar extends Food("Sugar")

object FruitSalad extends Recipe("Fruit Salad", Apple :: Orange :: Cream :: Sugar :: Nil, "Stir it all together")

