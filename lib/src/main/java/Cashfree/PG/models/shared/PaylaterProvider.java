/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PaylaterProvider - One of ["kotak", "flexipay", "zestmoney", "lazypay", "olapostpaid","simpl", "freechargepaylater"]. Please note that Flexipay is offered by HDFC bank
 */
public enum PaylaterProvider {
    KOTAK("kotak"),
    FLEXIPAY("flexipay"),
    ZESTMONEY("zestmoney"),
    LAZYPAY("lazypay"),
    OLAPOSTPAID("olapostpaid"),
    SIMPL("simpl"),
    FREECHARGEPAYLATER("freechargepaylater");

    @JsonValue
    public final String value;

    private PaylaterProvider(String value) {
        this.value = value;
    }
}
