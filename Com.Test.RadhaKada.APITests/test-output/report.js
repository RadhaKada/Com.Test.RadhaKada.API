$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/RestAPTTests.feature");
formatter.feature({
  "name": "Test CRUD methods in Sample REST API testing framework",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user set REST API url",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_set_REST_API_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "CreateBooking_POST",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user set HEADER param request content type \u0026 accept",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_set_HEADER_param_request_content_type_accept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user set request Body with basic authentication",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_set_request_Body_with_basic_authentication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send a POST HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "steps.send_a_POST_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_receive_valid_HTTP_response_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid Status Line",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_receive_valid_Status_Line()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user set REST API url",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_set_REST_API_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "UpdateBooking_PUT",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user set HEADER param request content type \u0026 accept",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_set_HEADER_param_request_content_type_accept()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user set Update request Body",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_set_Update_request_Body()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send a PUT HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "steps.send_a_PUT_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid HTTP response code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_receive_valid_HTTP_response_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid Status Line",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_receive_valid_Status_Line()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user set REST API url",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_set_REST_API_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "DeleteBooking_DELETE",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user set HEADER param request content type \u0026 cookie",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_set_HEADER_param_request_content_type_cookie()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user send DELETE HTTP request",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_send_DELETE_HTTP_request()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid HTTP response code 201 for \"DELETE.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_receive_valid_HTTP_response_code_for(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receive valid Status Line",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_receive_valid_Status_Line()"
});
formatter.result({
  "status": "passed"
});
});