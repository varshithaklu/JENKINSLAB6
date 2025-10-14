package com.dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BackendApplication extends SpringBootServletInitializer {

    // 🔹 For WAR deployment (Tomcat, JBoss, etc.)
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BackendApplication.class);
    }

    // 🔹 For JAR execution (java -jar backend.jar)
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
        System.out.println("✅ Backend project running....");
    }
}
