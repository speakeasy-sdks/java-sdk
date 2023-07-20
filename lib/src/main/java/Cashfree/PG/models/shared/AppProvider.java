/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * AppProvider - Specify the provider through which the payment must be processed.
 */
public enum AppProvider {
    GPAY("gpay"),
    PHONEPE("phonepe"),
    OLA("ola"),
    PAYTM("paytm"),
    AMAZON("amazon"),
    AIRTEL("airtel"),
    FREECHARGE("freecharge"),
    MOBIKWIK("mobikwik"),
    JIO("jio");

    @JsonValue
    public final String value;

    private AppProvider(String value) {
        this.value = value;
    }
}
