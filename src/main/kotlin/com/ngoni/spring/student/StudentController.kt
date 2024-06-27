package com.ngoni.spring.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDate
import java.time.Month

@RestController
@RequestMapping( "api/v1/student")
class StudentController {

    @Autowired
    lateinit var studentService:StudentService

    @GetMapping
    fun getStudents(): List<Student> =
        studentService.getStudents()

}
