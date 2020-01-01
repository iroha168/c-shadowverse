package gameground

import card.Card

case class Hand(cards: Seq[Card]) {
  def show(): Unit = {
    cards.foreach(println)
    println(s"Hand: ${cards.length}")
    println()
  }

  def apply(index: Int): Option[Card] = {
    if(0 <= index  || index < cards.length)
      Some(cards(index))
    else None
  }

  def :+(card: Card): Hand = Hand(cards :+ card)
}

object Hand{
  def apply(): Hand = {
    Hand(Nil)
  }
}
