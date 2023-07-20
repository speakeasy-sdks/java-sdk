/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CardChannel - The channel for card payments can be "link" or "post". Post is used for seamless OTP payments where merchant captures OTP on their own page.
 */
public enum CardChannel {
    LINK("link"),
    POST("post");

    @JsonValue
    public final String value;

    private CardChannel(String value) {
        this.value = value;
    }
}