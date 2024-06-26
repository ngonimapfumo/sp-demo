package com.ngoni.spring.student

import java.time.LocalDate

data class Student(val id: Long, val name: String, val dob: LocalDate, val email: String, val age: Int)
