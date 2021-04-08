package kLambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class OrdersHandler: RequestHandler<Order, OrderCreateResponse> {
    private val storeFactory = DaggerStoreFactory.create()
    private val store = storeFactory.store()
    override fun handleRequest(order: Order, context: Context): OrderCreateResponse {
        val logger = context.logger
        logger.log("handling request create order $order")
        val createdOrder = store.createOrder(order)
        return OrderCreateResponse(createdOrder.name, createdOrder.quantity, "created")
    }
}
