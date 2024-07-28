package com.longnh.utils.value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HttpResponse {
  public HttpStatus status;

  public String body;

  public HttpHeaders headers;
}
