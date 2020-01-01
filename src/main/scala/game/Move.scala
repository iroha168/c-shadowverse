package game

sealed trait Move {
  val from: Int
  val to: Int
}

final case class Summon(from: Int, to: Int) extends Move{
}
final case class Draw(from: Int, to: Int) extends Move
final case class Evolve(from: Int, to: Int) extends Move

