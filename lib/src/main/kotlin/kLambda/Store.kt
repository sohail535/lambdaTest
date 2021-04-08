package kLambda

import javax.inject.Inject

class Store @Inject constructor(private val database: IDatabase) {
    fun createOrder(order: Order): Order {
        return database.saveOrder(order)
    }
}