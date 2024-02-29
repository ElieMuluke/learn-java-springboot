package me.eliemuluke.demo.students;

import org.springframework.boot.CommandLineRunner;

import java.time.LocalDate;
import java.util.List;

public class StudentConfig {

    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student elie = new Student(
                    "elie",
                    "elie@mail.com",
                    LocalDate.of(2001, 9, 19),
                    "MALE",
                    15.0);

            Student kez = new Student(
                    "Kez",
                    "Kez@mail.com",
                    LocalDate.of(2004, 9, 19),
                    "FEMALE",
                    15.0);

            repository.saveAll(
                    List.of(elie, kez)
            );
        };
    }
}
