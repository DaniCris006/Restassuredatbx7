package org.example.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.protocol.ResponseServer;
import org.apache.log.Priority;
import org.openqa.selenium.json.Json;
import org.testng.annotations.Test;


public class JJIStest {
static RequestSpecification rs = RestAssured.given();
static Response r;
static ValidatableResponse vr;
String urls;
String payload="{\\\"request_type\\\":\\\"RESPONSE\\\"\\\"email\\\":\\\"daniyal.cristober@particleblack.com\\\"\\\"password\\\":\\\"Test@123\\\"}";
    String tik="eyJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWtsMll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE3Mjg1OTI3NzYsIm5iZiI6MTcyODU2Mzk3NiwidmVyIjoiMS4wIiwiaXNzIjoiaHR0cHM6Ly9jYXJkaWZvcnBpY3MuYjJjbG9naW4uY29tL2M3ZWMyM2I5LWJjODUtNDYyNi04ZDI5LTA3OTBjNmM2NzY1OS92Mi4wLyIsInN1YiI6IjM3MWQwZDIwLTE2NjUtNDU5Ny04N2JjLWFkNjY1NTFjZjM0NSIsImF1ZCI6IjA5MDExNzhhLTY4ZTItNGFjNy05NDY5LWMxZjczNzdiNTA2YyIsImlhdCI6MTcyODU2Mzk3NiwiYXV0aF90aW1lIjoxNzI4NTYzOTczLCJvaWQiOiIzNzFkMGQyMC0xNjY1LTQ1OTctODdiYy1hZDY2NTUxY2YzNDUiLCJuYW1lIjoiRGFuaXlhbCBDcmlzdG9iZXIiLCJnaXZlbl9uYW1lIjoiRGFuaXlhbCIsImZhbWlseV9uYW1lIjoiQ3Jpc3RvYmVyIiwiZXh0ZW5zaW9uX2N1c3RvbUlkIjoiNjExIiwiZW1haWxzIjpbImRhbml5YWwuY3Jpc3RvYmVyQHBhcnRpY2xlYmxhY2suY29tIl0sInRmcCI6IkIyQ18xX3N1c2kifQ.QQ1sSj-qXZbcypz1b2GjorAWbehL1dPUWw5v3ELfivYiPwL6c28jHZm1yHoJCNkndRtXZKry9GL9bVhGkJQKm-8TQcU6wRkGd6CXauXnHcYIbVlq0LaQlVOI75eVPOE_IOnXFKQQOFvGmxF23mdTAsQ39BdIPRhIPLrH87M0iKuqG4D_5gySGHTq9FT1XQNs1xwZIar7kWDRODK-7T1GswCNJZE_RMvz6hKBnaMoU8cPH7m-r3SMlvAbjulw3HvX2BhVTxlXG4pswJtFZ4mEYDqM8qw0gRUEzS9dONPF7AeCi60fuPhzKIaHccjSq4zhEuVtzR5OVEPYBjYrDzVQlQ";

    String token_payload="Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6Ilg1ZVhrNHh5b2pORnVtMWtsMll0djhkbE5QNC1jNTdkTzZRR1RWQndhTmsiLCJ0eXAiOiJKV1QifQ.eyJleHAiOjE3Mjg1ODY4NTUsIm5iZiI6MTcyODU1ODA1NSwidmVyIjoiMS4wIiwiaXNzIjoiaHR0cHM6Ly9jYXJkaWZvcnBpY3MuYjJjbG9naW4uY29tL2M3ZWMyM2I5LWJjODUtNDYyNi04ZDI5LTA3OTBjNmM2NzY1OS92Mi4wLyIsInN1YiI6IjM3MWQwZDIwLTE2NjUtNDU5Ny04N2JjLWFkNjY1NTFjZjM0NSIsImF1ZCI6IjA5MDExNzhhLTY4ZTItNGFjNy05NDY5LWMxZjczNzdiNTA2YyIsImlhdCI6MTcyODU1ODA1NSwiYXV0aF90aW1lIjoxNzI4NTU4MDU1LCJvaWQiOiIzNzFkMGQyMC0xNjY1LTQ1OTctODdiYy1hZDY2NTUxY2YzNDUiLCJuYW1lIjoiRGFuaXlhbCBDcmlzdG9iZXIiLCJnaXZlbl9uYW1lIjoiRGFuaXlhbCIsImZhbWlseV9uYW1lIjoiQ3Jpc3RvYmVyIiwiZXh0ZW5zaW9uX2N1c3RvbUlkIjoiNjExIiwiZW1haWxzIjpbImRhbml5YWwuY3Jpc3RvYmVyQHBhcnRpY2xlYmxhY2suY29tIl0sInRmcCI6IkIyQ18xX3N1c2kiLCJjX2hhc2giOiJlVVdoeU0teUdhbGp6UG52cHR3UlFBIn0.Iuq2Ur3N0mHQ9cd8Eac02AMsrKbgPvuD5sIz57jmrK9G9vy_TR1Iq9cbka8vQjc88jkowLHmaESVrWBE4tUA0c2BkR3yqjj3FRRPhMJjLPjiWCrxDtEa34DgMXhEN__Ywp1_0VRXcp5dyKJyTgjiolYD_V9Df4wYb2AKoCU2hWlVoLp7pbeg0kFRk5WNs1Lb9QGiDHYcQLtcszvWEUrD0F8MP4zyFaQU2wbGDXUWsYGnHr0UxFh5Mjr_CjNKgBu3e8LQpvNAW6kupWb2sMMIggGcahpGjq6mr5g9-EUeNZcWc6tFzBPH705NIIxdhdgNtS90uicrSnpA42wCrJhOBw\n";
//@Test
    public void url(){
        //Given
//        RequestSpecification rs= RestAssured.given();
        rs.baseUri("https://picsqa.cardinality.info/api/org/auth/config");
        //rs.contentType(ContentType.JSON).log().all();

        //when()
        r= rs.when().get();

        // then()
        vr= r.then().log().all();
        urls= r.jsonPath().getString("data.url");
//    System.out.println(urls);
//return null;
    }
    //@Test(dependsOnMethods = "url")
    public void Login(){
    rs.baseUri(urls);
    rs.contentType(ContentType.JSON).log().all();
    rs.body(payload);

    r=rs.when().post();
    vr=r.then().log().all();

}
@Test
public void ztoken(){
    rs.baseUri("https://picsqa.cardinality.info/api/platform/page-designer/policyGroup/organization/2");
    rs.contentType(ContentType.JSON).log().all();
    rs.auth().oauth2(tik);
            r=rs.when().get();
    vr=r.then().log().all();
}
@Test
public void user(){
        rs.baseUri("https://picsqa.cardinality.info/api/org/user/611");
    rs.contentType(ContentType.JSON).log().all();
    rs.auth().oauth2(tik).get();
    r=rs.when().get();
    vr=r.then().log().all();
}
}
