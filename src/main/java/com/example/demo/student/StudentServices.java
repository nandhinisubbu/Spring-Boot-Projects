package com.example.demo.student;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Component
public class StudentServices {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Nandhini",
                        "nandhini@gmail.com",
                        LocalDate.of(2001, Month.AUGUST,26),
                        20
                )
        );
    }
}
