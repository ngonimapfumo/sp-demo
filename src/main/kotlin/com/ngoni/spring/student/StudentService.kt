package com.ngoni.spring.student
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.Month


@Service
class StudentService {

    @Autowired
    lateinit var studentRepository:StudentRepository
    fun getStudents(): List<Student> = studentRepository.findAll()
}