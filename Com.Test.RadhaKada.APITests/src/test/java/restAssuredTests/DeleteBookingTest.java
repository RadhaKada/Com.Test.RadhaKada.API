package restAssuredTests;
import  io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBookingTest {

	//BDD approach DELETE request	
	//Make sure token is generated for cookie
	
	@BeforeClass
	public void setup() {
		
		String bookingId = "3";	
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";		
		RestAssured.basePath = "/" + bookingId;				
	}
	
	@Test
	public void deleteBooking_DELETE() {		
		
		Response response =	
		given()
			.auth().preemptive()
			.basic("admin", "password123")
			.contentType("application/json")			
			.cookie("token","5cea0649955cbb4")	
		
		.when()
		    .delete()
		    
		.then()
			.statusCode(201)
			.statusLine("HTTP/1.1 201 Created")			
			.log().all()
			.extract().response();
					
		System.out.println("Status Code is " + response.statusCode());
		System.out.println("Status Line is  " + response.statusLine());	
		
		
	}
	
	
	
}
