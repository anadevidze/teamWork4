package com.example.teamWork4.controller;

import com.example.teamWork4.service.CommentServiceI;
import com.example.teamWork4.service.PostServiceI;
import com.example.teamWork4.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    private final CommentServiceI commentServiceI;
    private final PostServiceI postServiceI;
    private final UserServiceI userServiceI;

    @Autowired
    AppController(CommentServiceI commentServiceI, PostServiceI postServiceI, UserServiceI userServiceI){
        this.commentServiceI = commentServiceI;
        this.postServiceI = postServiceI;
        this.userServiceI = userServiceI;
    }
}
