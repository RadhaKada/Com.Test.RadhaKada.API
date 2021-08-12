package restAssuredTests;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CreateAccessTokenTest {

	@BeforeClass
	public void setup() {
				
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/auth";			
		
	}
	
	@Test
	public void getAccessToken() {
		
		// Creating Token for further tests
		
		Response response =	
				given()
					.auth().preemptive()
					.basic("admin", "password123")
					.contentType("application/json")						
				
				.when()
				    .post()
				    
				.then()
					.statusCode(200)
				.and()
					.statusLine("HTTP/1.1 200 OK")
				.and()			
					.extract().response();
				
				response.prettyPrint();
				System.out.println("Status Code is " + response.statusCode());
				System.out.println("Status Line is " + response.statusLine());				
		
	}				
	
}
