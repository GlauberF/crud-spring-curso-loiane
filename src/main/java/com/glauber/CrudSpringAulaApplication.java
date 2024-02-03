package com.glauber;

import com.glauber.model.Course;
import com.glauber.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringAulaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudSpringAulaApplication.class, args);
    }

    @Bean()
    CommandLineRunner initDataBase(CourseRepository courseRepository) {
        return args -> {
            courseRepository.deleteAll();

            Course c = new Course();
            c.setName("Angular");
            c.setCategory("front-end");

            courseRepository.save(c);
        };
    }
}
