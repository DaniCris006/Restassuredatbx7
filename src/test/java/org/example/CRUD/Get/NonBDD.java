package org.example.CRUD.Get;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class NonBDD {
    static RequestSpecification rs= RestAssured.given();
    public static void main(String[] args) {
        //Non BDD Style
        // Given()-RequestSpecification
        //When()-Response
        //Then()-ResponseSpecification
        RequestSpecification rs= RestAssured.given();

        rs.baseUri("https://api.zippopotam.us");
        non_bdd();
        non_bdd2();
    }
    private static void non_bdd(){
        rs.basePath("/IN/600028");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);
    }
    private static void non_bdd2(){
        rs.basePath("/IN/600021");
        rs.when().log().all().get();
        rs.then().log().all().statusCode(200);
    }
}
