package stepDefinitions;

import static io.restassured.RestAssured.given;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.annotations.BeforeClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

// Step Definition file where user can find the test methods called in feature file

public class steps {
	
	String apiurl= "https://restful-booker.herokuapp.com/apidoc/index.html";
	String bookingId = "1";
	String path="/" + bookingId;	
	String tokenVal = "5cea0649955cbb4";
	public Properties configProp;	
	String bookingdata = "{\r\n" + 
			"    \"firstname\" : \"TestUser\",\r\n" + 
			"    \"lastname\" : \"Automation\",\r\n" + 
			"    \"totalprice\" : 111,\r\n" + 
			"    \"depositpaid\" : false,\r\n" + 
			"    \"bookingdates\" : {\r\n" + 
			"        \"checkin\" : \"2021-01-01\",\r\n" + 
			"        \"checkout\" : \"2022-01-01\"\r\n" + 
			"    },\r\n" + 
			"    \"additionalneeds\" : \"lunch\"\r\n" + 
			"}";	
	
	String updatedBookingData = "{\r\n" + 
			"    \"firstname\" : \"BDDUser\",\r\n" + 
			"    \"lastname\" : \"Automation\",\r\n" + 
			"    \"totalprice\" : 111,\r\n" + 
			"    \"depositpaid\" : false,\r\n" + 
			"    \"bookingdates\" : {\r\n" + 
			"        \"checkin\" : \"2021-01-01\",\r\n" + 
			"        \"checkout\" : \"2022-01-01\"\r\n" + 
			"    },\r\n" + 
			"    \"additionalneeds\" : \"lunch\"\r\n" + 
			"}";
	
	
	// Future extension - parameterization
	
	@BeforeClass
	public void setup() throws IOException {
		
		configProp = new Properties();
		FileInputStream configPropfile = new FileInputStream("config.properties");
		configProp.load(configPropfile);
		
		String api_url=configProp.getProperty("apiurl");
				
		RestAssured.baseURI = api_url;		
		
	}
	
	//************* Background Request Steps***********
	
	@Given("user set REST API url")
	public void user_set_REST_API_url() {
		
		System.out.println("Rest API set successfully in setup phase");
			    
	}
	
	//************* POST Request Steps***********

	@When("user set HEADER param request content type & accept")
	public void user_set_HEADER_param_request_content_type_accept(){
		 given()
			.auth().preemptive()
			.basic("admin", "password123")
			.contentType("application/json")
			.accept("application/json");
					
	}

	@And("user set request Body with basic authentication")
	public void user_set_request_Body_with_basic_authentication() {
		given().body(bookingdata);
	}

	@And("send a POST HTTP request")
	public void send_a_POST_HTTP_request() {
	    given().when().post(apiurl);
	}

	@Then("user receive valid HTTP response code {int}")
	public void user_receive_valid_HTTP_response_code(Integer int1) {
		given().when().then().statusCode(int1);
		System.out.println("Status Code is " + int1);
	}

	@And("user receive valid Status Line")
	public void user_receive_valid_Status_Line() {
		given().when().then().statusLine("HTTP/1.1 200 OK");
		System.out.println("Status Line is HTTP/1.1 200 OK");
	}
	
	//************* PUT Request Steps***********
	
	@When("user set Update request Body")
	public void user_set_Update_request_Body() {
		given().body(updatedBookingData);
	}

	@And("send a PUT HTTP request")
	public void send_a_PUT_HTTP_request() {
		given().when().put(apiurl + path);
	}
	
	//************* DELETE Request Steps***********

	@When("user set HEADER param request content type & cookie")
	public void user_set_HEADER_param_request_content_type_cookie() {
		 given()
			.auth().preemptive()
			.basic("admin", "password123")
			.contentType("application/json")			
		 	.cookie("token",tokenVal);
					
	}

	@And("user send DELETE HTTP request")
	public void user_send_DELETE_HTTP_request() {
		given().when().delete(apiurl + path);
	}

	@Then("user receive valid HTTP response code {int} for {string}")
	public void user_receive_valid_HTTP_response_code_for(Integer int1, String string) {
		given().when().then().statusCode(int1);
		System.out.println("Status Code is " + int1 + " for " + string);
	}
}
