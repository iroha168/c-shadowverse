package card

trait Card {
  val name: String
  val cost: Int
  val trait_ : Trait
  val cardPack: CardPack
  val abilityTypes: Option[Seq[AbilityType]]
  val cardText: Option[String]
  val rarity: Rarity

  def typeExists(abilityType: AbilityType): Boolean = {
    abilityTypes match {
      case Some(types) => types.exists(_ == abilityType)
      case None => false
    }
  }

  def isStorm: Boolean = typeExists(Storm)

}
