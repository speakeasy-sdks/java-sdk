# orders

### Available Operations

* [createOrder](#createorder) - Create Order
* [orderPay](#orderpay) - Order Pay

## createOrder

Use this API to create orders with Cashfree from your backend and get the payment link. To use this API S2S flag needs to be enabled from the backend. In case you want to use the cards payment option the PCI DSS flag is required, for more information email us at "care@cashfree.com".

### Example Usage

```java
package hello.world;

import Cashfree.PG.Pg;
import Cashfree.PG.models.callbacks.CreateOrderPaymentWebhookResponse;
import Cashfree.PG.models.operations.CreateOrderRequest;
import Cashfree.PG.models.operations.CreateOrderResponse;
import Cashfree.PG.models.shared.CreateOrderBackendRequest;
import Cashfree.PG.models.shared.CustomerDetails;
import Cashfree.PG.models.shared.OrderMeta;
import Cashfree.PG.models.shared.PaymentSuccessWebhook;
import Cashfree.PG.models.shared.TerminalDetails;
import Cashfree.PG.models.shared.VendorSplit;
import Cashfree.PG.models.shared.WHcard;
import Cashfree.PG.models.shared.WHcustomerDetails;
import Cashfree.PG.models.shared.WHdata;
import Cashfree.PG.models.shared.WHorder;
import Cashfree.PG.models.shared.WHpayment;
import Cashfree.PG.models.shared.WHpaymentMethod;

public class Application {
    public static void main(String[] args) {
        try {
            Pg sdk = Pg.builder()
                .build();

            CreateOrderRequest req = new CreateOrderRequest("ab", "quis") {{
                createOrderBackendRequest = new CreateOrderBackendRequest(                new CustomerDetails("veritatis", "deserunt") {{
                                    customerBankAccountNumber = "perferendis";
                                    customerBankCode = "ipsam";
                                    customerBankIfsc = "repellendus";
                                    customerEmail = "sapiente";
                                }};, 10.15d, "INR") {{
                    orderExpiryTime = "2021-07-29T00:00:00Z";
                    orderId = "quo";
                    orderMeta = new OrderMeta() {{
                        notifyUrl = "odit";
                        paymentMethods = "at";
                        returnUrl = "at";
                    }};;
                    orderNote = "Test order";
                    orderSplits = new Cashfree.PG.models.shared.VendorSplit[]{{
                        add(new VendorSplit() {{
                            amount = 4736.08d;
                            percentage = 7991.59d;
                            vendorId = "quod";
                        }}),
                        add(new VendorSplit() {{
                            amount = 4614.79d;
                            percentage = 5204.78d;
                            vendorId = "porro";
                        }}),
                        add(new VendorSplit() {{
                            amount = 6788.8d;
                            percentage = 1182.74d;
                            vendorId = "nam";
                        }}),
                        add(new VendorSplit() {{
                            amount = 6399.21d;
                            percentage = 5820.2d;
                            vendorId = "fugit";
                        }}),
                    }};
                    orderTags = new java.util.HashMap<String, String>() {{
                        put("hic", "optio");
                        put("totam", "beatae");
                        put("commodi", "molestiae");
                    }};
                    terminal = new TerminalDetails("modi", "qui", "impedit");;
                }};;
                xApiVersion = "cum";
            }};            

            CreateOrderResponse res = sdk.orders.createOrder(req);

            if (res.ordersEntity != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [Cashfree.PG.models.operations.CreateOrderRequest](../../models/operations/CreateOrderRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |


### Response

**[Cashfree.PG.models.operations.CreateOrderResponse](../../models/operations/CreateOrderResponse.md)**


## orderPay

Use this API when you have already created the orders and want Cashfree to process the payment. To use this API S2S flag needs to be enabled from the backend. In case you want to use the cards payment option the PCI DSS flag is required, for more information send an email to "care@cashfree.com".

### Example Usage

```java
package hello.world;

import Cashfree.PG.Pg;
import Cashfree.PG.models.operations.OrderPayRequest;
import Cashfree.PG.models.operations.OrderPayResponse;
import Cashfree.PG.models.shared.App;
import Cashfree.PG.models.shared.AppPaymentMethod;
import Cashfree.PG.models.shared.AppProvider;
import Cashfree.PG.models.shared.Card;
import Cashfree.PG.models.shared.CardCardBankName;
import Cashfree.PG.models.shared.CardChannel;
import Cashfree.PG.models.shared.CardEMI;
import Cashfree.PG.models.shared.CardEMICardBankName;
import Cashfree.PG.models.shared.CardEMIPaymentMethod;
import Cashfree.PG.models.shared.CardPaymentMethod;
import Cashfree.PG.models.shared.CardlessEMI;
import Cashfree.PG.models.shared.CardlessEMIPaymentMethod;
import Cashfree.PG.models.shared.CardlessEMIProvider;
import Cashfree.PG.models.shared.NetBankingPaymentMethod;
import Cashfree.PG.models.shared.Netbanking;
import Cashfree.PG.models.shared.OrderPayRequest;
import Cashfree.PG.models.shared.Paylater;
import Cashfree.PG.models.shared.PaylaterPaymentMethod;
import Cashfree.PG.models.shared.PaylaterProvider;
import Cashfree.PG.models.shared.UPIAuthorizeDetails;
import Cashfree.PG.models.shared.UPIPaymentMethod;
import Cashfree.PG.models.shared.Upi;
import Cashfree.PG.models.shared.UpiChannel;

public class Application {
    public static void main(String[] args) {
        try {
            Pg sdk = Pg.builder()
                .build();

            OrderPayRequest req = new OrderPayRequest("esse") {{
                orderPayRequest = new OrderPayRequest(                new UPIPaymentMethod(                new Upi(UpiChannel.LINK) {{
                                                    authorization = new UPIAuthorizeDetails() {{
                                                        approveBy = "natus";
                                                        endTime = "laboriosam";
                                                        startTime = "hic";
                                                    }};;
                                                    authorizeOnly = false;
                                                    upiExpiryMinutes = 9025.99d;
                                                    upiId = "fuga";
                                                }};) {{
                                    upi = new Upi(UpiChannel.COLLECT) {{
                                        authorization = new UPIAuthorizeDetails() {{
                                            approveBy = "excepturi";
                                            endTime = "aspernatur";
                                            startTime = "perferendis";
                                        }};
                                        authorizeOnly = false;
                                        channel = UpiChannel.LINK;
                                        upiExpiryMinutes = 6176.36d;
                                        upiId = "sed";
                                    }};
                                }}, "session__CvcEmNKDkmERQrxnx39ibhJ3Ii034pjc8ZVxf3qcgEXCWlgDDlHRgz2XYZCqpajDQSXMMtCusPgOIxYP2LZx0-05p39gC2Vgmq1RAj--gcn") {{
                    offerId = "faa6cc05-d1e2-401c-b0cf-0c9db3ff0f0b";
                    saveInstrument = false;
                }};;
            }};            

            OrderPayResponse res = sdk.orders.orderPay(req);

            if (res.orderPayResponse != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [Cashfree.PG.models.operations.OrderPayRequest](../../models/operations/OrderPayRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |


### Response

**[Cashfree.PG.models.operations.OrderPayResponse](../../models/operations/OrderPayResponse.md)**

