package kLambda

import com.amazonaws.services.lambda.runtime.Context
import io.mockk.mockk
import kotlin.test.Test
import kotlin.test.assertEquals

class OrdersHandlerTest {
    @Test fun testSomeLibraryMethod() {
        val classUnderTest = OrdersHandler()
        val mockkContext = mockk<Context>(relaxed = true)
        assertEquals(
            classUnderTest.handleRequest(Order("jon", 3), mockkContext),
            OrderCreateResponse("jon", 3, "created")
        )
    }
}
