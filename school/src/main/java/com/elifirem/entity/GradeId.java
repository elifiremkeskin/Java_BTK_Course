package com.elifirem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode // iki idnin eşitliğini karşılaştırır
@Embeddable//bu sınıfın başka bi entity içinde kullanılacağını belirtir
public class GradeId implements Serializable { //composite sınıfı için implement gerekli
    @Column(name = "studentid")
    private int studentId;

    @Column(name = "classid")
    private int classId;
}
