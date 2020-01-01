package card

trait Follower extends Card {
  val attack: Int
  val defence: Int
  val evolvedAttack: Int
  val evolvedDefence: Int
  val bufForAttack: Int
  val bufForDefence: Int

  override def toString: String = name
}
