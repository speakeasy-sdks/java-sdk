/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SettlementURLObject {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("url")
    public String url;

    public SettlementURLObject withUrl(String url) {
        this.url = url;
        return this;
    }
    
    public SettlementURLObject(){}
}
