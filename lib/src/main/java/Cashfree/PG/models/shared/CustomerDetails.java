/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerDetails - The customer details that are necessary. Note that you can pass dummy details if your use case does not require the customer details.
 */

public class CustomerDetails {
    /**
     * Customer bank account. Required if you want to do a bank account check (TPV)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_bank_account_number")
    public String customerBankAccountNumber;

    public CustomerDetails withCustomerBankAccountNumber(String customerBankAccountNumber) {
        this.customerBankAccountNumber = customerBankAccountNumber;
        return this;
    }
    
    /**
     * Customer bank code. Required for net banking payments, if you want to do a bank account check (TPV)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_bank_code")
    public String customerBankCode;

    public CustomerDetails withCustomerBankCode(String customerBankCode) {
        this.customerBankCode = customerBankCode;
        return this;
    }
    
    /**
     * Customer bank IFSC. Required if you want to do a bank account check (TPV)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_bank_ifsc")
    public String customerBankIfsc;

    public CustomerDetails withCustomerBankIfsc(String customerBankIfsc) {
        this.customerBankIfsc = customerBankIfsc;
        return this;
    }
    
    /**
     * Customer email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customer_email")
    public String customerEmail;

    public CustomerDetails withCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }
    
    /**
     * A unique identifier for the customer. Use alphanumeric values only.
     */
    @JsonProperty("customer_id")
    public String customerId;

    public CustomerDetails withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    /**
     * Customer phone number.
     */
    @JsonProperty("customer_phone")
    public String customerPhone;

    public CustomerDetails withCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }
    
    public CustomerDetails(@JsonProperty("customer_id") String customerId, @JsonProperty("customer_phone") String customerPhone) {
        this.customerId = customerId;
        this.customerPhone = customerPhone;
  }
}
