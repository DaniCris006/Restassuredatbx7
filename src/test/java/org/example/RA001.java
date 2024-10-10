package org.example;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RA001 {
    public static void main(String[] args) {
        //Get Request Example
        //Gherkins Syntax:
        //Given() - url,body[Payload],header,
        //When() - Method [get(),post(),put(),delete()]
        //Then() - Validation [Verify the given output LHS=RHS]
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1").log().all()
                        .when().get()
                        .then().log().all() //log().all() is to see the value in Terminal
                        .statusCode(200);
        RequestSpecification r= RestAssured.given();
        r.basePath("");
    }
}
