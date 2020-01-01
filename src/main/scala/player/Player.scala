package player

import gameground.{Deck, Hand}

final case class Player() {
  def draw(hand: Hand, deck: Deck): (Hand, Deck) = {
    val newHand = hand :+ deck.top
    val newDeck = deck.tail
    (newHand, newDeck)
  }
}
