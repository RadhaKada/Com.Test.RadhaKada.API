package restAssuredTests;
import  io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBookingTest {

	//POST Method
	
	String bookingdata = "{\r\n" + 
			"    \"firstname\" : \"Jim4\",\r\n" + 
			"    \"lastname\" : \"Brown\",\r\n" + 
			"    \"totalprice\" : 111,\r\n" + 
			"    \"depositpaid\" : true,\r\n" + 
			"    \"bookingdates\" : {\r\n" + 
			"        \"checkin\" : \"2018-01-01\",\r\n" + 
			"        \"checkout\" : \"2019-01-01\"\r\n" + 
			"    },\r\n" + 
			"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
			"}";
	
	
	@BeforeClass
	public void setup() {
				
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";			
		
	}
	
	@Test
	public void createBooking_Post() {
				
		Response response =	
		given()
			.auth().preemptive()
			.basic("admin", "password123")
			.contentType("application/json")
			.accept("application/json")
			.body(bookingdata)		
		
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
