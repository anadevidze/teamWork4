package com.example.teamWork4.Repository;

import com.example.teamWork4.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
        User findByUsername(String username);
    }

