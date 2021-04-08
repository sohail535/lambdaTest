package kLambda

class Store(private val database: Database) {
    fun createOrder(order: Order): Order {
        return database.saveOrder(order)
    }
}