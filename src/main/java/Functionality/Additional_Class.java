package Functionality;

import static io.restassured.RestAssured.given;
import org.hamcrest.core.Is;

public class Additional_Class {

    public void Get_Ten_Users()
    {
        String url = "https://jsonplaceholder.typicode.com/users";
        given().header("Content-Type","application/json")
                .get(url)
                .then()
                .assertThat()
                .body("list.size()",Is.is(10));
    }
    public void Post_User_And_Verify()
    {
        String url="https://jsonplaceholder.typicode.com/users";
        given().header("Content-Type","application/json")
                .post(url)
                .then()
                .assertThat().body("id",Is.is(11));
    }
}
