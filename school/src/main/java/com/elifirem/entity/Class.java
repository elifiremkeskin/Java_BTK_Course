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
@Table(name = "classes")
public class Class {
    @Id
    @Column(name = "classid")
    private int classId;

    @Column(name = "classname")
    private String className;

    @ManyToOne
    @JoinColumn(name = "teacherid")
    private Teacher teacher;

}
