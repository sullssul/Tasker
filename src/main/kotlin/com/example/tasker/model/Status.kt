package com.example.tasker.model

import javax.persistence.*

@Entity
class Status(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val title: String
)
