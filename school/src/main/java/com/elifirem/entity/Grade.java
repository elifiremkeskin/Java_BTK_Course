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
@Table(name = "grades")
public class Grade {
    @EmbeddedId
    private GradeId id;

    @MapsId("studentId")
    @ManyToOne
    @JoinColumn(name = "studentid")
    private Student student;

    @MapsId("classId")
    @ManyToOne
    @JoinColumn(name = "classid")
    private Class classs;

    @Column(name = "midterm")
    private Double midterm;

    @Column(name = "final")
    private Double finalterm;
}
