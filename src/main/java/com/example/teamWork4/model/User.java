package com.example.teamWork4.model;

import jakarta.persistence.*;

@Entity
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;
        private String lastName;
        @Column(unique = true)
        private String username;
        private String dateOfBirth;
}
