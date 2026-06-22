package orderBook

import models.{Buy, Order, Sell, Trade}

case class OrderBook private (buyOrders: List[Order], sellOrders: List[Order], trades: List[Trade]) {
  def add(order: Order): OrderBook = {
    order.side match{
      case Buy => {
        val newList = order :: buyOrders
        OrderBook(newList, sellOrders, trades)
      }
      case Sell => {
        val newList = order :: sellOrders
        OrderBook(buyOrders, newList, trades)
      }
    }
  }
}

object OrderBook{
  def apply(buyOrders: List[Order], sellOrders: List[Order], trades: List[Trade]): OrderBook = {

    def descending(orders: List[Order]): List[Order] = {
      orders.sortBy(o => o.price).reverse
    }

    def ascending(orders: List[Order]): List[Order] = {
      orders.sortBy(o => o.price)
    }

    new OrderBook(descending(buyOrders), ascending(sellOrders), trades)
  }

}