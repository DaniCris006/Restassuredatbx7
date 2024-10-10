package org.example.WOMainfuntion;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Test01 {
    @Description("Verify the URL")
    @Severity(SeverityLevel.NORMAL)
    @Test
    public void test_1(){
        //Given
        RequestSpecification rs= RestAssured.given();
        rs.baseUri("https://picsqa.cardinality.info/api/org/auth/config");
        //rs.contentType(ContentType.JSON).log().all();

        //when()
        Response r= rs.when().get();

        // then()
        ValidatableResponse vr= r.then().log().all();
    }
}
