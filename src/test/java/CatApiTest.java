import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.function.Predicate;

import static io.restassured.RestAssured.given;

public class CatApiTest {

    @Test
    public void test() {
        given().header("x-api-key", "4e3be815-bff6-4e55-8b48-ace245ebf831")
                .when()
                .get("https://api.thecatapi.com/v1/favourites")
                .then().statusCode(200);
    }

    @Test
    public void test2() {
        given().header("x-api-key", "4e3be815-bff6-4e55-8b48-ace245ebf831")
                .when()
                .get("https://api.thecatapi.com/v1/votes")
                .then()
                .statusCode(200);
    }

    @Test
    public void test3() {
        given().header("x-api-key", "4e3be815-bff6-4e55-8b48-ace245ebf831")
                .when()
                .get("https://api.thecatapi.com/v1/breeds")
                .then()
                .body("[0].weight.imperial", CoreMatchers.equalTo("7  -  10"));
    }

}
