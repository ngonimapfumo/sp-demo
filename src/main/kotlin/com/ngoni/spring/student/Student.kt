package com.ngoni.spring.student

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table
class Student {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    var id: Long? = null
    private var name: String? = null
    private var email: String? = null
    private var dob: LocalDate? = null
    private var age: Int? = null


    constructor()

    constructor(id: Long?, name: String?, email: String?, dob: LocalDate?, age: Int?) {
        this.id = id
        this.name = name
        this.email = email
        this.dob = dob
        this.age = age
    }

    constructor(name: String?, email: String?, dob: LocalDate?, age: Int?) {
        this.name = name
        this.email = email
        this.dob = dob
        this.age = age
    }

    override fun toString(): String {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}'
    }
}
