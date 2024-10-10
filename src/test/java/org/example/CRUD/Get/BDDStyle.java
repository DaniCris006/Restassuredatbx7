package org.example.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BDDStyle {


    public static void main(String[] args) {
        // BDD - Framework different - Gherkins Syntax - [given,when,then]
        //Non-BDD still using Gherkins Syntax [using classes]

        //BDD Style
        // To Run Multiple time need to copy paste all to use again
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/600021")
                .when().log().all().get()
                .then()
                .log().all().statusCode(200);

        BDD();
        BDD2();


    }
    private static void BDD(){           //For BDD Style
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/600021")
                .when().log().all().get()
                .then()
                .log().all().statusCode(200);
    }
    private static void BDD2(){          //For BDD Style
        RestAssured.given().baseUri("https://api.zippopotam.us")
                .basePath("/IN/600045")
                .when().log().all().get()
                .then()
                .log().all().statusCode(200);
    }


}
