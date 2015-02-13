package org.stairway.recipe

/**
 * Created by alexwhouse on 2/11/15.
 */
class Recipe(
              val name: String,
              val ingredients: List[Food],
              val instructions: String
              ) {
  override def toString = name
}

