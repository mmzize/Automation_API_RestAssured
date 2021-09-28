package Functionality;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Logging {

    public void Log_Response()
    {
        String url="https://jsonplaceholder.typicode.com/users";

        given().
                when()
                .get(url)
                .then()
                .log().all();
    }
}
