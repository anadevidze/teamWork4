package com.example.teamWork4.Repository;

import com.example.teamWork4.model.Comment;
import com.example.teamWork4.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);
}
