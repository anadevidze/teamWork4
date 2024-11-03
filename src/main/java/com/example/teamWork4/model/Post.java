package com.example.teamWork4.model;

import jakarta.persistence.*;

@Entity
    public class Post {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String text;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User createdBy;
}
