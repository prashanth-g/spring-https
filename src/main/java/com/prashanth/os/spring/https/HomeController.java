package com.prashanth.os.spring.https;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/https")
public class HomeController {

  @GetMapping
  public String home() {
    return "This is HTTPS!";
  }
}
