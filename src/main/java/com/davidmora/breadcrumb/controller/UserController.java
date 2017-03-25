package com.davidmora.breadcrumb.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
