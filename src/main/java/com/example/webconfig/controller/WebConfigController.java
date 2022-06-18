package com.example.webconfig.controller;

import com.example.webconfig.config.LabelProperties;
import com.example.webconfig.config.ServerProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebConfigController {

  @Autowired
  private ServerProperties serverProperties;

  @Autowired
  private LabelProperties labelProperties;

  @GetMapping
  public String getHello() {
    log.info("serverProperties:{}", serverProperties);
    log.info("labelProperties:{}", labelProperties);
    return "Hello World";
  }
}
