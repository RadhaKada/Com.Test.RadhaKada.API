Feature: Test CRUD methods in Sample REST API testing framework

Background:
	Given user set REST API url

@sanity
Scenario: CreateBooking_POST   
 When user set HEADER param request content type & accept 
 And user set request Body with basic authentication
 And send a POST HTTP request 
 Then user receive valid HTTP response code 200
 And user receive valid Status Line 
 

@sanity
Scenario: UpdateBooking_PUT
	When user set HEADER param request content type & accept
  And user set Update request Body
	And send a PUT HTTP request
  Then user receive valid HTTP response code 200
	And user receive valid Status Line

@sanity
Scenario: DeleteBooking_DELETE
	When user set HEADER param request content type & cookie
  And user send DELETE HTTP request
  Then user receive valid HTTP response code 201 for "DELETE." 
  And user receive valid Status Line