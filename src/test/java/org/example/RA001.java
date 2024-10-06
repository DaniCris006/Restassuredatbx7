package org.example;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class RA001 {
    public static void main(String[] args) {
        System.out.println("Hello World ");
        RestAssured
                .given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1").log().all()
                        .when().get()
                        .then().statusCode(200);
        RequestSpecification r= RestAssured.given();
        r.basePath("");
    }
}
