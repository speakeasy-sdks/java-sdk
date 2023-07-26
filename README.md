# PG

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'Cashfree.PG:PG:1.2.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations


### [orders](docs/sdks/orders/README.md)

* [createOrder](docs/sdks/orders/README.md#createorder) - Create Order
* [orderPay](docs/sdks/orders/README.md#orderpay) - Order Pay
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
