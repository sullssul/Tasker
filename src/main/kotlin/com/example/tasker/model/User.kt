package com.example.tasker.model

import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.Email
import javax.validation.constraints.Min
import javax.validation.constraints.NotEmpty

@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    @Email
    @NotEmpty
    val email: String,

    @Column(nullable = false)
    @NotEmpty
    val firstName: String,

    @Column(nullable = false)
    @NotEmpty
    val secondName: String,

    @Column(nullable = false)
    @NotEmpty
    val nickName: String,

    @NotEmpty
    val registrationDate: LocalDate,
    val groups: Group,
    val status: Status,
    val tasks: List<Task>
)