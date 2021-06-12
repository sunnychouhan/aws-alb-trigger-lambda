
package com.chousun.albtriggerlambda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbLambdaRequest {
    private String body;

    private HashMap<String, String> headers;
  
    private String httpMethod;
  
    private Boolean isBase64Encoded;
  
    private String path;
  
    private List<String> queryStringParameters;
  
    private RequestContext requestContext;

}
