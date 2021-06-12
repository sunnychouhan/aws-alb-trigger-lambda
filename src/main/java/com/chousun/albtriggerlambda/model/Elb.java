
package com.chousun.albtriggerlambda.model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Elb {

    private String targetGroupArn;
}
