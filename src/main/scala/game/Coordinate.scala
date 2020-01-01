package game

sealed abstract class Position(pos: Int)
final case class FieldPos(pos: Int) extends Position(pos)
final case class PlayerPos(pos: Int) extends Position(pos)
