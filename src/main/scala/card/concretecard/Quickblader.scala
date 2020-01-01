package card.concretecard

import card._

final case class Quickblader() extends Follower{
  override val cost: Int = 1
  override val attack: Int = 1
  override val defence: Int = 1
  override val evolvedAttack: Int = 3
  override val evolvedDefence: Int = 3
  override val trait_ : Trait = Officer
  override val cardPack: CardPack = Basic
  override val abilityTypes: Option[Seq[AbilityType]] = Some(Seq(Storm))
  override val cardText: Option[String] =  None
  override val rarity: Rarity = Bronze
  override val bufForAttack: Int = 0
  override val bufForDefence: Int = 0
  override val name: String = "Quickblader"
}
