/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Paylater {
    /**
     * The channel for cardless EMI is always `link`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("channel")
    public String channel;

    public Paylater withChannel(String channel) {
        this.channel = channel;
        return this;
    }
    
    /**
     * Customers phone number for this payment instrument. If the customer is not eligible you will receive a 400 error with type as 'invalid_request_error' and code as 'invalid_request_error'
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    public String phone;

    public Paylater withPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    /**
     * One of ["kotak", "flexipay", "zestmoney", "lazypay", "olapostpaid","simpl", "freechargepaylater"]. Please note that Flexipay is offered by HDFC bank
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("provider")
    public PaylaterProvider provider;

    public Paylater withProvider(PaylaterProvider provider) {
        this.provider = provider;
        return this;
    }
    
    public Paylater(){}
}
