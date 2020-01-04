package player

import gameground.{Deck, Hand}

final case class Player(hand: Hand, deck: Deck) {
  def draw(): Player = {
    val newHand = hand :+ deck.top
    val newDeck = deck.tail
    Player(newHand, newDeck)
  }

  def drawN(n: Int): Either[PlayerException, Player] = {
    if(n >= 1) {
      val player = draw()
      player.drawN(n - 1)
    }else if(n == 0){
      Right(Player(hand, deck))
    }else{
      Left(NegativeDrawNumberException)
    }
  }
}
