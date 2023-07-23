<!-- Start SDK Example Usage -->


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

            CreateOrderRequest req = new CreateOrderRequest("corrupti", "provident") {{
                createOrderBackendRequest = new CreateOrderBackendRequest(                new CustomerDetails("distinctio", "quibusdam") {{
                                    customerBankAccountNumber = "unde";
                                    customerBankCode = "nulla";
                                    customerBankIfsc = "corrupti";
                                    customerEmail = "illum";
                                }};, 10.15d, "INR") {{
                    orderExpiryTime = "2021-07-29T00:00:00Z";
                    orderId = "vel";
                    orderMeta = new OrderMeta() {{
                        notifyUrl = "error";
                        paymentMethods = "deserunt";
                        returnUrl = "suscipit";
                    }};;
                    orderNote = "Test order";
                    orderSplits = new Cashfree.PG.models.shared.VendorSplit[]{{
                        add(new VendorSplit() {{
                            amount = 2975.34d;
                            percentage = 8917.73d;
                            vendorId = "ipsa";
                        }}),
                        add(new VendorSplit() {{
                            amount = 9636.63d;
                            percentage = 2726.56d;
                            vendorId = "suscipit";
                        }}),
                    }};
                    orderTags = new java.util.HashMap<String, String>() {{
                        put("minus", "placeat");
                        put("voluptatum", "iusto");
                    }};
                    terminal = new TerminalDetails("excepturi", "nisi", "recusandae");;
                }};;
                xApiVersion = "temporibus";
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
<!-- End SDK Example Usage -->