package com.elifirem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    @Column(name = "studentname")
    private String studentName;

    @Column(name = "studentsurname")
    private String studentSurname;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentid")
    private int studentId;

    @Column(name = "studentno", unique = true)
    private int studentNo;

}
