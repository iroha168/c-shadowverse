package gameground

import card.Card

case class Field(cells: Map[Int, Card]) {

}

object Field {
  val PlayerFieldMax = 5
  val FieldMax = PlayerFieldMax * 2
}
