package game

import gameground.Field
import player.Player

case class GameStatus(firstPlayer: Player, secondPlayer: Player, filed: Field) {
  def isFinished: Boolean = true
}
