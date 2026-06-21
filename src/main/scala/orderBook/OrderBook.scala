package orderBook

import models.{Order, Trade}

case class OrderBook private (buyOrders: List[Order], sellOrders: List[Order], trades: List[Trade])

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