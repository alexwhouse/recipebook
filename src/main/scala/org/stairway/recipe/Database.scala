package org.stairway.recipe

/**
 * Created by alexwhouse on 2/12/15.
 */
abstract class Database extends FoodCategories {
  def allFoods: List[Food]

  def allRecipes: List[Recipe]

  def foodNamed(name: String) =
    allFoods.find(f => f.name == name)
}

