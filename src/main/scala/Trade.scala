import java.util.UUID


case class Trade(price:Double, id: UUID, sell: Order, buy: Order, quantity: Double) {
  require(quantity > 0, "Quantity has to be more than 0.")
  require(price > 0, "Price has to be more than 0.")
  val min = Math.min(sell.quantity, buy.quantity)
  require(quantity <= min, "Quantity cannot be more than min of Sell and Buy quantities.")
}