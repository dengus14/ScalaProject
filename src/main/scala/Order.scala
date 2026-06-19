import java.util.UUID

case class Order(side: Side, id: UUID, symbol: Symbol, quantity: Double, price: Double ) {
    require(price > 0, "Price has to be more than 0.")
    require(quantity > 0, "Quantity has to be more than 0.")
}