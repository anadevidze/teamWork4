package com.example.teamWork4.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "sw_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String username;
    private Date dateOfBirth;
}
