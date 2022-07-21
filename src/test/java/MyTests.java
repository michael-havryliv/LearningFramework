import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class MyTests {

    private final static String URL = "https://reqres.in/";

    @Test
    public void test(){
        given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/users/2")
                .then().statusCode(200);
    }
}
