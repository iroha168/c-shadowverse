package player

import gameground.{Deck, Hand}

final case class Player() {
  def draw(hand: Hand, deck: Deck): (Hand, Deck) = {
    val newHand = hand :+ deck.top
    val newDeck = deck.tail
    (newHand, newDeck)
  }

  def drawN(hand: Hand, deck: Deck, n: Int): (Hand, Deck) = {
    if(n >= 1) {
      val (newHand, newDeck) = draw(hand, deck)
      drawN(newHand, newDeck, n - 1)
    }else if(n == 0){
      (hand, deck)
    }else{
      throw new RuntimeException("Something wrong") // TODO do a proper error handling
    }
  }
}
