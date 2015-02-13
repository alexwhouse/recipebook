package org.stairway.recipe

/**
 * Created by alexwhouse on 2/12/15.
 */
trait FoodCategories {
  def allCategories: List[FoodCategory]

  case class FoodCategory(name: String, foods: List[Food])

}
