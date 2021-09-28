package Functionality;

import static org.hamcrest.CoreMatchers.containsString;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class DOG_Breeds {

    public void getAllDogBreeds()
    {
        baseURI="https://dog.ceo/api/breeds/list/all";

        given().get(baseURI)
                .then()
                .assertThat()
                .statusCode(200);
    }
    public void verifyRetrieverIsOnTheList()
    {
        baseURI = "https://dog.ceo/api/breeds/list/all";

        given().get(baseURI)
                .then()
                .assertThat()
                .body("message.retriever[3]",containsString("golden"));
    }
}