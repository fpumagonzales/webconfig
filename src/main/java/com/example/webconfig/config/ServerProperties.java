package com.example.webconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Map;

@Configuration
@ConfigurationProperties(prefix = "server")
@Data
public class ServerProperties {
  private Map<String, String> application;
  private Map<String, List<String>> config;
  private Map<String, Credential> users;

  @Data
  public static class Credential {

    private String username;
    private String password;

  }
}
