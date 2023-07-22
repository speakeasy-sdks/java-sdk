/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuthenticationError - Authentication Error
 */

public class AuthenticationError {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public AuthenticationError withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    public String message;

    public AuthenticationError withMessage(String message) {
        this.message = message;
        return this;
    }
    
    /**
     * authentication_error
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public AuthenticationErrorType type;

    public AuthenticationError withType(AuthenticationErrorType type) {
        this.type = type;
        return this;
    }
    
    public AuthenticationError(){}
}
