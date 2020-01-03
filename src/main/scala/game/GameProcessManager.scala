package game

import gameground.{Deck, Hand}
import player.Player

import scala.annotation.tailrec

object GameProcessManager {
  def displayResult(): Unit = {
    println("someone won and the other lost")
  }

  @tailrec
  private[game] def turn(gameStatus: GameStatus): Unit = {
    if(gameStatus.isFinished){
      displayResult()
    }else {
      turn(gameStatus)
    }
  }

  def start(): Unit = {
    val deck = Deck()
    val hand = Hand()
    val player = Player(hand, deck)
    deck.show()
    hand.show()
    val nPlayer = player.drawN(3)
    nPlayer.deck.show()
    nPlayer.hand.show()
  }
}
