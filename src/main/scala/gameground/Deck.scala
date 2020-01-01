package gameground

import card.Card
import card.concretecard.Quickblader

case class Deck(cards: Seq[Card] = Nil) {
  def show(): Unit ={
    cards.foreach(println)
    println(s"Deck: ${cards.length}")
    println()
  }

  def tail: Deck = Deck(cards.tail)
  def top: Card = cards(0)
}

object Deck{
  def apply(): Deck= {
    val initialDeck = Seq.fill(30)(Quickblader())
    new Deck(initialDeck)
  }
}
