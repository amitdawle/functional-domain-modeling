package domain.ordertaking

class CustomerId(val customerId: Int)
class WidgetCode(val widgetCode: String)
class UnitQuantity(val unitQuantity: Int)
class KilogramQuantity(val kilogramQuantity: Float)

typealias CustomerInfo = Nothing
typealias ShippingAddress = Nothing
typealias BillingAddress = Nothing
typealias OrderLine = Nothing
typealias AmountToBill = Nothing


data class Order(
    val customerInfo : CustomerInfo,
    val shippingAddress : ShippingAddress,
    val billingAddress : BillingAddress,
    val orderLines : List<OrderLine>,
    val amountToBill : AmountToBill
)

