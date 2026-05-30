package APITesting;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GetRequestDemo {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/api";

		System.out.println("============== GET REQUEST ==============");

		Response getResponse =given().when().get("/users/8052292");

		System.out.println("Status Code : " + getResponse.getStatusCode());
		System.out.println("Response Body : " + getResponse.getBody().asString());
		System.out.println("Response Time : " + getResponse.getTime());
		System.out.println("Content Type : " + getResponse.getContentType());
//        System.out.println("\n============== VALIDATIONS ==============");
//
//        given()
//        .when()
//            .get("/api/users/2")
//        .then()
//            .statusCode(200)
//            .body("data.first_name", equalTo("Janet"))
//            .body("data.last_name", equalTo("Weaver"))
//            .time(lessThan(5000L))
//            .header("Content-Type", containsString("application/json"))
//            .log().all();
//
//
//        System.out.println("\n============== JSON EXTRACTION ==============");
//
//        JsonPath jsonPath = getResponse.jsonPath();
//
//        System.out.println("ID : " + jsonPath.getInt("data.id"));
//        System.out.println("Email : " + jsonPath.getString("data.email"));
//        System.out.println("First Name : " + jsonPath.getString("data.first_name"));
//
//
//        System.out.println("\n============== POST REQUEST ==============");
//
//        String postRequestBody =
//                "{ \"name\":\"Vaishali\", \"job\":\"Tester\" }";
//
//        Response postResponse =
//                given()
//                    .contentType(ContentType.JSON)
//                    .body(postRequestBody)
//                .when()
//                    .post("/api/users");
//
//        postResponse.then()
//                .statusCode(201)
//                .log().all();
//
//        String generatedId = postResponse.jsonPath().getString("id");
//        System.out.println("Generated ID : " + generatedId);
//
//
//        System.out.println("\n============== PUT REQUEST ==============");
//
//        String putRequestBody =
//                "{ \"name\":\"Vaishali\", \"job\":\"Senior Tester\" }";
//
//        given()
//            .contentType(ContentType.JSON)
//            .body(putRequestBody)
//        .when()
//            .put("/api/users/2")
//        .then()
//            .statusCode(200)
//            .log().all();
//
//
//        System.out.println("\n============== DELETE REQUEST ==============");
//
//        given()
//        .when()
//            .delete("/api/users/2")
//        .then()
//            .statusCode(204)
//            .log().all();
//
//
//        System.out.println("\n============== PATH PARAMETER ==============");
//
//        given()
//            .pathParam("id", 2)
//        .when()
//            .get("/api/users/{id}")
//        .then()
//            .statusCode(200)
//            .log().all();
//
//
//        System.out.println("\n============== QUERY PARAMETER ==============");
//
//        given()
//            .queryParam("page", 2)
//        .when()
//            .get("/api/users")
//        .then()
//            .statusCode(200)
//            .log().all();
//
//
//        System.out.println("\n============== HEADERS ==============");
//
//        given()
//            .header("Content-Type", "application/json")
//        .when()
//            .get("/api/users/2")
//        .then()
//            .statusCode(200)
//            .log().headers();
//
//
//        System.out.println("\n============== BEARER TOKEN (DEMO) ==============");
//
//        String token = "YOUR_TOKEN";
//
//        given()
//            .header("Authorization", "Bearer " + token)
//        .when()
//            .get("https://gorest.co.in/public/v2/users")
//        .then()
//            .statusCode(200)
//            .log().all();
//
//
//        System.out.println("\n============== REQUEST CHAINING ==============");
//
//        Response chainResponse =
//                given()
//                    .contentType(ContentType.JSON)
//                    .body(postRequestBody)
//                .when()
//                    .post("/api/users");
//
//        String chainId = chainResponse.jsonPath().getString("id");
//
//        given()
//            .pathParam("id", chainId)
//        .when()
//            .get("/api/users/{id}")
//        .then()
//            .log().all();
//
//
//        System.out.println("\n============== JSON SCHEMA VALIDATION ==============");
//
//        given()
//        .when()
//            .get("/api/users/2")
//        .then()
//            .assertThat()
//            .body(matchesJsonSchemaInClasspath("schema.json"))
//            .log().all();
//
//
//        System.out.println("\n============== PRINT HEADERS ==============");
//
//        getResponse.getHeaders().forEach(System.out::println);
//
//
//        System.out.println("\n============== PRINT COOKIES ==============");
//
//        getResponse.getCookies().forEach((k, v) ->
//                System.out.println(k + " : " + v)
//        );
//
//
//        System.out.println("\n============== TEST COMPLETED ==============");
    }
}