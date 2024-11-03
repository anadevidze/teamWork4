package com.example.teamWork4.repository;

import com.example.teamWork4.model.Post;
import com.example.teamWork4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByCreatedBy(User user);
}