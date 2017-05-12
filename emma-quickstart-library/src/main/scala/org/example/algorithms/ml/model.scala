package org.example
package algorithms.ml

import breeze.linalg.{Vector => Vec}
import org.emmalanguage.api._

/** Machine learning model objects. */
object model {
  case class Point[ID](@emma.pk id: ID, pos: Array[Double])
  case class LPoint[ID, L](@emma.pk id: ID, pos: Array[Double], label: L)
}
