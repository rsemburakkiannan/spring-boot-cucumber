package com.dbdemo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class NoSqlVersionStepDefinition extends SpringE2ETest {
	
	private ResponseEntity<String> latestResponse;
	
	
	@When("^the client calls /nosql/version$")
	public void the_client_issues_GET_version() throws Throwable{
		latestResponse = executeGet("http://localhost:8080/nosql/version");
	}

	@Then("^the client receives nosql version status code of (\\d+)$")
	public void the_client_receives_status_code_of(int statusCode) throws Throwable {
	    HttpStatus currentStatusCode = latestResponse.getStatusCode();
		assertEquals("Status code " + latestResponse.getBody(), currentStatusCode.value(), currentStatusCode.value());
	}

	@And("^the client receives nosql server version (.+)$")
	public void the_client_receives_server_version_body(String version) throws Throwable {
		assertEquals(latestResponse.getBody(), version);
	}
}
