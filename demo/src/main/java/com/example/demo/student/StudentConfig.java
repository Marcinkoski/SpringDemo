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
    CommandLineRunner commandLineRunner(StudentRepo repository){
        return args ->{
            Student marcin = new Student(
              "Marcin",
              "Marcin@Marcin",
                    LocalDate.of(1990, Month.JANUARY, 5)

            );
            Student maria = new Student(
                    "Maria",
                    "Maria@Maria",
                    LocalDate.of(2000, Month.JANUARY, 5)

            );
            repository.saveAll(
                    List.of(marcin, maria)
            );
        };
    }
}
