/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RateLimitError - Rate Limit Error
 */

public class RateLimitError {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public RateLimitError withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public RateLimitError withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * rate_limit_error
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public RateLimitErrorType type;

    public RateLimitError withType(RateLimitErrorType type) {
        this.type = type;
        return this;
    }
    
    public RateLimitError(){}
}