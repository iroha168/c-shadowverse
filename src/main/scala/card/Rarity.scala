package card

sealed case class Rarity()

object Legendary extends Rarity
object Gold extends Rarity
object Silver extends Rarity
object Bronze extends Rarity

