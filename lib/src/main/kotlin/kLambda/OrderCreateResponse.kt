package kLambda

data class OrderCreateResponse(
    val name: String,
    val quantity: Int,
    val status: String
)