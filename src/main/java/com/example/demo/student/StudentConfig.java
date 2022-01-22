package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration

public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student nandhini = new Student(
                    1L,
                    "Nandhini",
                    "nandhini@gmail.com",
                    LocalDate.of(2001, Month.AUGUST,26),
                    20
            );

            Student subbikcha = new Student(
                    2L,
                    "Subbikcha",
                    "subbikcha@gmail.com",
                    LocalDate.of(2000, Month.SEPTEMBER,16),
                    21
            );

            repository.saveAll(
                    List.of(nandhini, subbikcha)
            );
        };
    }
}
