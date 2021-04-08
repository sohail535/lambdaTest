package kLambda

import javax.inject.Inject

class Database @Inject constructor(){
    private val orders = mutableMapOf<String, Order>()

    fun saveOrder(order: Order): Order {
        orders.putIfAbsent(order.name, order)
        return orders[order.name]!!
    }
}