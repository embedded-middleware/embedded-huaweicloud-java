package io.github.embedded.hc.aom.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.github.embedded.hc.aom")
public class AomApplication {
    public static void main(String[] args) {
        SpringApplication.run(AomApplication.class, args);
    }
}
