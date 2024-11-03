package com.example.teamWork4.model;

import jakarta.persistence.*;

@Entity
@Table(name="sw_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    @JoinColumn(name = "id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "id")
    private User createdBy;
}