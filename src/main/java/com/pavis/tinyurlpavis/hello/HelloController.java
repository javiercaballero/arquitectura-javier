package com.pavis.tinyurlpavis.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
  @GetMapping("/hola")
  public Map<String, Object> hello() {
    return Map.of("message", "Hola Mundo");
  }
}

