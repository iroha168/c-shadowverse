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
    val player = Player()
    deck.show()
    hand.show()
    val (nhand, ndeck) = player.drawN(hand, deck, 3)
    ndeck.show()
    nhand.show()
  }
}
