package kLambda

import javax.inject.Inject

class SQLite @Inject constructor(): IDatabase{
    private val orders = mutableMapOf<String, Order>()

    override fun saveOrder(order: Order): Order {
        orders.putIfAbsent(order.name, order)
        return orders[order.name]!!
    }
}