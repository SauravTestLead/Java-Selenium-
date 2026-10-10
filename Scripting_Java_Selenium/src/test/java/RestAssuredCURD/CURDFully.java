package RestAssuredCURD;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class CURDFully {

    @Test
    public void FullyCheck(){
        RestAssured.baseURI = "https://reqres.in/api";

// Create
        /*
        given().contentType("application/json")
                .body("{\"name\":\"Saurav\",\"job\":\"QA\"}")
                .when().post("/users")
                .then().statusCode(201);

         */

// Read
        given().when().get("/users/2")
                .then().statusCode(200);

// Update (PUT)
        given().contentType("application/json")
                .body("{\"name\":\"Saurav\",\"job\":\"Manager\"}")
                .when().put("/users/2")
                .then().statusCode(200);

// Partial Update (PATCH)
        given().contentType("application/json")
                .body("{\"job\":\"Lead QA\"}")
                .when().patch("/users/2")
                .then().statusCode(200);

// Delete
        given().when().delete("/users/2")
                .then().statusCode(204);

    }
}
