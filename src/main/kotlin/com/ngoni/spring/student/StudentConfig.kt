package com.ngoni.spring.student

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.LocalDate
import java.time.Month

@Configuration
class StudentConfig {
    @Bean
    fun commandLineRunner(studentRepository: StudentRepository): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
           val NgoniM = Student(
                "Ngoni",
                "ngoni@test.com",
                LocalDate.of(1950, Month.JULY, 9),
                34
            )
           val Name =  Student(
                "Name",
                "name@test2.com",
                LocalDate.of(1952, Month.OCTOBER, 9),
                34
            )
            studentRepository.saveAll(listOf(Name,NgoniM))
        }

    }
}
