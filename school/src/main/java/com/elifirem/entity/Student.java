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
    private Integer studentId; //buraya id biz atamayacağımız için null gönderecek
    //int yazsaydık 400 hatası alırdık o yüzden null kabul eden integer yazıyoruz
    //bu columnun da tabloda generated olarak tanımlandığından emin ol yoksa hata alırsın
    //eğer öyle tanımlı değilse silip tekrar generated olarak oluştur
    //setval değerini de son kalandan bir büyük ayarla yoksa yeni ekleyeceğin değerlere id 1 atamaya çalışır bu da hata verir


    @Column(name = "studentno", unique = true)
    private int studentNo;

}
