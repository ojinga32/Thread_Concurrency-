package org.example.javaadv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaAdv1Application {

    public static void main(String[] args) {
        SpringApplication.run(JavaAdv1Application.class, args);
        for(int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }

}
