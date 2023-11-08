package com.example.mapping.mappingdemo.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "jpa_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
}
