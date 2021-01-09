package org.doteva.digitalbank.register.account;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @Bean
  public Function<String, String> create() {
	  return value -> new StringBuilder(value).toString().toLowerCase().toString();
  }

  @Bean
  public Function<String, String> find() {
    return value -> value.toUpperCase();
  }

  @Bean
  public Supplier<String> get() {
	  return () -> { return "123456"; };
  }
  
  
}