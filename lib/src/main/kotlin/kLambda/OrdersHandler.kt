package kLambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class OrdersHandler: RequestHandler<Order, OrderCreateResponse> {
    private val database = Database()
    private val store = Store(database)
    override fun handleRequest(order: Order, context: Context): OrderCreateResponse {
        val logger = context.logger
        logger.log("handling request create order $order")
        val createdOrder = store.createOrder(order)
        return OrderCreateResponse(createdOrder.name, createdOrder.quantity, "created")
    }
}
