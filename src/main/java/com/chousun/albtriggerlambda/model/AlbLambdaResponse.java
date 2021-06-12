package com.chousun.albtriggerlambda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlbLambdaResponse {

  
    private String body;
  
    private HashMap<String, String> headers;
  
    private Boolean isBase64Encoded;
  
    private Long statusCode;
  
    private String statusDescription;
}
