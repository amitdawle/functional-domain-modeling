{-# LANGUAGE EmptyDataDecls, KindSignatures #-}
module Domain.OrderTaking where


data CustomerId = CustomerId Int deriving (Show, Eq)
data WidgetCode = WidgetCode String deriving (Show, Eq)
data UnitQuantity = UnitQuantity Int deriving (Show, Eq)
data KilogramQuantity =  KilogramQuantity Float deriving (Show, Eq)

data Order = Order {
  customerInfo    :: CustomerInfo,
  shippingAddress :: ShippingAddress,
  billingAddress  :: BillingAddress,
  orderLines      :: [OrderLines],
  amountToBill    :: AmountToBill
} deriving (Show)

data CustomerInfo :: * -> *
data ShippingAddress :: * -> *
data BillingAddress :: * -> *
data OrderLines :: * -> *
data AmountToBill :: * -> *
