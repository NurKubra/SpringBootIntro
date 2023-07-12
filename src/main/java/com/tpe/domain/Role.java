package com.tpe.domain;

import com.tpe.domain.enums.RoleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)  //--> normalde tabloda enum tipind ebir veri kaydemezken--> bu anantion ile String olarak db de kaydeilmeisni sagladik
    @Column(nullable = false)
    private RoleType type;   //rollerim belilri sayida olsun istedigim icin enum ile olusturudum
}
