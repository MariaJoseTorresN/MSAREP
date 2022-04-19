package edu.escuelaing.arep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"edu.escuelaing.arep"})
@SpringBootApplication
public class PostServiceApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(PostServiceApplication.class, args);
    }
}
