package domain.ordertaking

class CustomerId(val customerId: Int)
class WidgetCode(val widgetCode: String)
class UnitQuantity(val unitQuantity: Int)
class KilogramQuantity(val kilogramQuantity: Float)


data class Order(
    val customerInfo : Nothing,
    val shippingAddress : Nothing,
    val billingAddress : Nothing,
    val orderLines : Nothing,
    val amountToBill : Nothing
)