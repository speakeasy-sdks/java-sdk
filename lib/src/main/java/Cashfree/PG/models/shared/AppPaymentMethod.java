/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package Cashfree.PG.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AppPaymentMethod {
    @JsonProperty("app")
    public App app;

    public AppPaymentMethod withApp(App app) {
        this.app = app;
        return this;
    }
    
    public AppPaymentMethod(@JsonProperty("app") App app) {
        this.app = app;
  }
}
