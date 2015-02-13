package org.stairway.recipe

/**
 * Created by alexwhouse on 2/12/15.
 */
abstract class Browser {
  val database: Database

  def recipesUsing(food: Food) =
    database.allRecipes.filter(recipe =>
      recipe.ingredients.contains(food))

  def displayCategory(category: database.FoodCategory): Unit = {
    println(category)
  }
}
