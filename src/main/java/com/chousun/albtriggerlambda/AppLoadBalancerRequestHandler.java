package com.chousun.albtriggerlambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.chousun.albtriggerlambda.model.AlbLambdaRequest;
import com.chousun.albtriggerlambda.model.AlbLambdaResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class AppLoadBalancerRequestHandler implements RequestHandler<AlbLambdaRequest, AlbLambdaResponse> {
    private static final Logger logger = LoggerFactory.getLogger(AppLoadBalancerRequestHandler.class);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @Override
    public AlbLambdaResponse handleRequest(AlbLambdaRequest s, Context context) {
        logger.info("Reached  AppLoadBalancerRequestHandler : " + s);
        Util.logEnvironment(s, context, gson);
        HashMap<String, String> headers = new HashMap();
        headers.put("Content-Type", "text/html");

        String responseBody = "<h1>Wow Succeeded in getting Response from Aws Lambda Through Load Balancer</h1>";
        AlbLambdaResponse albLambdaResponse = AlbLambdaResponse.builder()
                .body(responseBody)
                .headers(headers)
                .isBase64Encoded(false)
                .statusCode(200l)
                .statusDescription("200 OK")
                .build();
        String json = gson.toJson(albLambdaResponse);
        logger.info("AlbLambdaResponse : "+ json);
        return albLambdaResponse;
    }
}
