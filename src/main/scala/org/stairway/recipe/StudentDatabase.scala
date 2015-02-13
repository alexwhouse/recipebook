package org.stairway.recipe

/**
 * Created by alexwhouse on 2/12/15.
 */
object StudentDatabase extends Database {
  def allFoods = FrozenFood :: Nil

  def allCategories = FoodCategory("edible", FrozenFood :: Nil) :: Nil

  def allRecipes = HeatItUp :: Nil

  object FrozenFood extends Food("Frozen Food")

  object HeatItUp extends Recipe("Heat it up", List(FrozenFood), "Microwave the 'food' for 10 minutes.")

}

object StudentBrowser extends Browser {
  override val database: Database = StudentDatabase
}