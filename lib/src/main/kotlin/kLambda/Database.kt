package kLambda

class Database {
    private val orders = mutableMapOf<String, Order>()

    fun saveOrder(order: Order): Order {
        orders.putIfAbsent(order.name, order)
        return orders[order.name]!!
    }
}