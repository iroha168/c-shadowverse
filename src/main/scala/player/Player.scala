package player

import gameground.{Deck, Hand}

final case class Player(hand: Hand, deck: Deck) {
  def draw(): Player = {
    val newHand = hand :+ deck.top
    val newDeck = deck.tail
    Player(newHand, newDeck)
  }

  def drawN(n: Int): Player = {
    if(n >= 1) {
      val player = draw()
      player.drawN(n - 1)
    }else if(n == 0){
      Player(hand, deck)
    }else{
      throw new RuntimeException("Something wrong") // TODO do a proper error handling
    }
  }
}
