/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Upi {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorization")
    public UPIAuthorizeDetails authorization;

    public Upi withAuthorization(UPIAuthorizeDetails authorization) {
        this.authorization = authorization;
        return this;
    }
    
    /**
     * For one time mandate on UPI. Set this as authorize_only = true. Please note that you can only use the "collect" channel if you are sending a one time mandate request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authorize_only")
    public Boolean authorizeOnly;

    public Upi withAuthorizeOnly(Boolean authorizeOnly) {
        this.authorizeOnly = authorizeOnly;
        return this;
    }
    
    /**
     * Specify the channel through which the payment must be processed. Can be one of ["link", "collect", "qrcode"]
     */
    @JsonProperty("channel")
    public UpiChannel channel;

    public Upi withChannel(UpiChannel channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * The UPI request will be valid for this expiry minutes. This parameter is only applicable for a UPI collect payment. The default value is 5 minutes. You should keep the minimum as 5 minutes, and maximum as 15 minutes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upi_expiry_minutes")
    public Double upiExpiryMinutes;

    public Upi withUpiExpiryMinutes(Double upiExpiryMinutes) {
        this.upiExpiryMinutes = upiExpiryMinutes;
        return this;
    }
    
    /**
     * Customer UPI VPA to process payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("upi_id")
    public String upiId;

    public Upi withUpiId(String upiId) {
        this.upiId = upiId;
        return this;
    }
    
    public Upi(@JsonProperty("channel") UpiChannel channel) {
        this.channel = channel;
  }
}
