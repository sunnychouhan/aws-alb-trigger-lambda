package com.chousun.albtriggerlambda;

import com.chousun.albtriggerlambda.model.AlbLambdaResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;


class AlbTriggerLambdaApplicationTests {

	@Test
	void contextLoads() {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String responseBody = "<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"<title>Page Title</title>\n" +
				"</head>\n" +
				"<body>\n" +
				"\n" +
				"<h1>Wow Succeeded in getting Response from Aws Lambda Through Application Load Balancer</h1>" +
				"<p style='color:blue;'>This is your request :</p>\n" +
				"\n" +
				"</body>\n" +
				"</html>";
		AlbLambdaResponse albLambdaResponse = AlbLambdaResponse.builder()
				.body(responseBody)
				.isBase64Encoded(false)
				.statusCode(200l)
				.statusDescription("200 OK")
				.build();
		String json = gson.toJson(albLambdaResponse);
		System.out.println("json = " + json);
	}

}
