package com.ngoni.spring.student
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Month


@Service
class StudentService {
    fun getStudents(): List<Student> = listOf(
        Student(
            1L,
            "Ngoni",
            LocalDate.of(2000, Month.MARCH, 2),
            "ngoni@test.com", 32
        )
    )
}