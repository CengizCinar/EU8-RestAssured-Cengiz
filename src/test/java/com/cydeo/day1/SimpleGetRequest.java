package com.cydeo.day1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class SimpleGetRequest {

    String url = "http://54.210.214.100:8000/api/spartans";

    @Test
    public void test(){
        //send a request and save response inside the Response object
        Response response = RestAssured.get(url);


        System.out.println("response.statusCode() = " + response.statusCode());

        response.prettyPrint();

    }
}
