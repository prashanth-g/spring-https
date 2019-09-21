package com.prashanth.os.spring.https;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HomeControllerTest {

  @LocalServerPort
  private int port;

  @Autowired
  HomeController homeController;

  @Autowired
  TestRestTemplate testRestTemplate;

  @Test
  public void contextLoads() throws Exception {
    assertThat(homeController).isNotNull();
  }

  @Test
  public void homeShouldReturnErrorMessageWithHTTP() throws Exception {
    assertThat(this.testRestTemplate.getForObject("http://localhost:"+ port + "/https", String.class))
        .contains("This combination of host and port requires TLS");
  }

}
