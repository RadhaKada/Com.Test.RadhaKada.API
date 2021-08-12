package restAssuredTests;
import  io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UpdateBookingTest {

	//BDD approach PUT request	
	//Make sure token is generated for cookie
	
	String bookingdata = "{\r\n" + 
			"    \"firstname\" : \"Test\",\r\n" + 
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
		
		int bookingId = 2;		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/booking";	
		RestAssured.basePath = "/" + bookingId;			
	}	
	
	@Test
	public void updateBooking_PUT() {				
		
		// Updated 'firstname' to 'Test'
		
		Response response =		
		given()
			.auth().preemptive()
			.basic("admin", "password123")
			.contentType("application/json")
			.accept("application/json")		
			.body(bookingdata)		
			.cookie("token","5cea0649955cbb4")			
			.log().all()
		
		.when()
		    .put()
		    
		.then()
			.statusCode(200)
		.and()
			.statusLine("HTTP/1.1 200 OK")
		.and()	
			.body("firstname", equalTo("Test"))
		.and()
			.extract().response();
		
		response.prettyPrint();		
		System.out.println("Status Code is " + response.statusCode());
		System.out.println("Status Line is  " + response.statusLine());		
		
	}
	
}
