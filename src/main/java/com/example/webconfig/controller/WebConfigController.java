package com.example.webconfig.controller;

import com.example.webconfig.config.LabelProperties;
import com.example.webconfig.config.ServerProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@Slf4j
public class WebConfigController {

  @Autowired
  private ServerProperties serverProperties;

  @Autowired
  private LabelProperties labelProperties;

  @GetMapping
  public String getHello() {
    return "Hello World";
  }

  @GetMapping("config")
  public Map<String, List<String>> getConfig() {
    log.info("info:{}", serverProperties.getConfig());
    return this.serverProperties.getConfig();
  }

  @GetMapping("users")
  public Map<String, ServerProperties.Credential> getUsers(){
    log.info("info:{}", serverProperties.getUsers());
    return this.serverProperties.getUsers();
  }

  @GetMapping("label")
  public Object getLabel() {
    return this.labelProperties.getAliases();
  }

}
