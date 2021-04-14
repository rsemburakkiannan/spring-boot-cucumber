package com.dbdemo;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources")
public class RdbmsVersionStepDefinition extends SpringE2ETest {

    private ResponseEntity<String> latestResponse;


    @When("^the client calls /rdbms/version$")
    public void the_client_issues_GET_version() throws Throwable {
        latestResponse = executeGet("http://localhost:8080/rdbms/version");
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        HttpStatus currentStatusCode = latestResponse.getStatusCode();
        assertEquals("Status code " + latestResponse.getBody(), currentStatusCode.value(), currentStatusCode.value());
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
		assertEquals(latestResponse.getBody(), version);
    }
}
