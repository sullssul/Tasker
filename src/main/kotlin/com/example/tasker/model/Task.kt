package com.example.tasker.model

import java.time.LocalDate
import javax.persistence.*

@Entity
class Task(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,

    @Column(nullable = false)
    val title: String,
    val description: String,
    @Column(nullable = false)
    val createDate: LocalDate,
    val parentId: Int,
    @Column(nullable = false)
    val isParent: Boolean,

    @Column(nullable = true)
    @OneToMany(cascade = [CascadeType.ALL])
    val comments: List<Comment>,

    @Column(nullable = true)
    @OneToMany(cascade = [CascadeType.ALL])
    val executors: List<User>,

    @Column(nullable = true)
    @OneToMany(cascade = [CascadeType.ALL])
    val childIds: List<Int>,

    @Column(nullable = true)
    @OneToMany(cascade = [CascadeType.ALL])
    val status: Status
)