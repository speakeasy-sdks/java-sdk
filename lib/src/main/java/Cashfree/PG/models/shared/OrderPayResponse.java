/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrderPayResponse - OK
 */

public class OrderPayResponse {
    /**
     * One of ["link", "custom", "form"]
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("action")
    public OrderPayResponseAction action;

    public OrderPayResponse withAction(OrderPayResponseAction action) {
        this.action = action;
        return this;
    }
    
    /**
     * Payment identifier created by Cashfree
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_payment_id")
    public Long cfPaymentId;

    public OrderPayResponse withCfPaymentId(Long cfPaymentId) {
        this.cfPaymentId = cfPaymentId;
        return this;
    }
    
    /**
     * One of ["link", "collect", "qrcode"]. In an older version we used to support different channels like 'gpay', 'phonepe' etc. However, we now support only the following channels - link, collect and qrcode. To process payments using gpay, you will have to provide channel as 'link' and provider as 'gpay'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public OrderPayResponseChannel channel;

    public OrderPayResponse withChannel(OrderPayResponseChannel channel) {
        this.channel = channel;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public OrderPayData data;

    public OrderPayResponse withData(OrderPayData data) {
        this.data = data;
        return this;
    }
    
    /**
     * One of ["upi", "netbanking", "card", "app", "cardless_emi", "paylater"] 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    public OrderPayResponsePaymentMethod paymentMethod;

    public OrderPayResponse withPaymentMethod(OrderPayResponsePaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    
    public OrderPayResponse(){}
}
