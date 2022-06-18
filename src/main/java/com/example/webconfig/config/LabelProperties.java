package com.example.webconfig.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "label")
@PropertySource(value = "classpath:label.yml", factory = YamlPropertySourceFactory.class)
public class LabelProperties {
  private String name;
  private List<String> aliases;

 }
