package kLambda

interface IDatabase {
    fun saveOrder(order: Order): Order
}