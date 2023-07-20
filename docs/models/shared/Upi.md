# Upi


## Fields

| Field                                                                                                                                                                                                                   | Type                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                | Description                                                                                                                                                                                                             |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `authorization`                                                                                                                                                                                                         | [UPIAuthorizeDetails](../../models/shared/UPIAuthorizeDetails.md)                                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                      | N/A                                                                                                                                                                                                                     |
| `authorizeOnly`                                                                                                                                                                                                         | *Boolean*                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                      | For one time mandate on UPI. Set this as authorize_only = true. Please note that you can only use the "collect" channel if you are sending a one time mandate request                                                   |
| `channel`                                                                                                                                                                                                               | [UpiChannel](../../models/shared/UpiChannel.md)                                                                                                                                                                         | :heavy_check_mark:                                                                                                                                                                                                      | Specify the channel through which the payment must be processed. Can be one of ["link", "collect", "qrcode"]                                                                                                            |
| `upiExpiryMinutes`                                                                                                                                                                                                      | *Double*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                      | The UPI request will be valid for this expiry minutes. This parameter is only applicable for a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5 minutes, and maximum as 15 minutes |
| `upiId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                                                                      | Customer UPI VPA to process payment.                                                                                                                                                                                    |