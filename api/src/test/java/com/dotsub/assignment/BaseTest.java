package com.dotsub.assignment;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.BeforeClass;

/**
 * @author Muhammad Salman
 */

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class BaseTest extends AbstractTestNGSpringContextTests {

  @LocalServerPort
  protected int port;
  protected String baseUrl = "http://localhost:";
  protected RestTemplate restTemplate = new RestTemplate();
  @Autowired
  protected ObjectMapper objectMapper;

  @BeforeClass
  public void setUrl() {
    baseUrl += port + "/api";
  }
}
