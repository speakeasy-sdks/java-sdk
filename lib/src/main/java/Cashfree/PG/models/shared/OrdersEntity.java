/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OrdersEntity - OK
 */

public class OrdersEntity {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cf_order_id")
    public Long cfOrderId;

    public OrdersEntity withCfOrderId(Long cfOrderId) {
        this.cfOrderId = cfOrderId;
        return this;
    }
    
    /**
     * The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_details")
    public CustomerDetails customerDetails;

    public OrdersEntity withCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity")
    public String entity;

    public OrdersEntity withEntity(String entity) {
        this.entity = entity;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_amount")
    public Double orderAmount;

    public OrdersEntity withOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_currency")
    public String orderCurrency;

    public OrdersEntity withOrderCurrency(String orderCurrency) {
        this.orderCurrency = orderCurrency;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_expiry_time")
    public String orderExpiryTime;

    public OrdersEntity withOrderExpiryTime(String orderExpiryTime) {
        this.orderExpiryTime = orderExpiryTime;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_id")
    public String orderId;

    public OrdersEntity withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_meta")
    public OrderMeta orderMeta;

    public OrdersEntity withOrderMeta(OrderMeta orderMeta) {
        this.orderMeta = orderMeta;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_note")
    public String orderNote;

    public OrdersEntity withOrderNote(String orderNote) {
        this.orderNote = orderNote;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("order_status")
    public String orderStatus;

    public OrdersEntity withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_session_id")
    public String paymentSessionId;

    public OrdersEntity withPaymentSessionId(String paymentSessionId) {
        this.paymentSessionId = paymentSessionId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payments")
    public PaymentURLObject payments;

    public OrdersEntity withPayments(PaymentURLObject payments) {
        this.payments = payments;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refunds")
    public RefundURLObject refunds;

    public OrdersEntity withRefunds(RefundURLObject refunds) {
        this.refunds = refunds;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("settlements")
    public SettlementURLObject settlements;

    public OrdersEntity withSettlements(SettlementURLObject settlements) {
        this.settlements = settlements;
        return this;
    }
    
    public OrdersEntity(){}
}
