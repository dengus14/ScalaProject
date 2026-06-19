import java.util.UUID

case class Order(side: Side, id: UUID, symbol: Symbol, quantity: Double, price: Double ) {

}