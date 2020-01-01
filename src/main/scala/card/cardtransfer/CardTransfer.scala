package card.cardtransfer

import gameground.{Deck, Field, Hand}
import leader.Evolve

trait CardTransfer[A, B] {
  def move(from: A, to: B): (A, B)
}

