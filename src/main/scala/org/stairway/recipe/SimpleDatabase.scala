package org.stairway.recipe

/**
 * Created by alexwhouse on 2/12/15.
 */
object SimpleDatabase extends Database {
  private var categories = List(
    FoodCategory("fruits", List(Apple, Orange)),
    FoodCategory("misc", List(Cream, Sugar))
  )

  def allFoods = Apple :: Orange :: Cream :: Sugar :: Nil

  def allRecipes: List[Recipe] = List(FruitSalad)

  def allCategories = categories
}
