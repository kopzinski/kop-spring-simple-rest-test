package br.com.kopzinski;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class EchoIT {

	@Test
	public void firstEchoTest() {
		get("/echo/hello").then().assertThat().body("message", equalTo("hello"));
	}
}