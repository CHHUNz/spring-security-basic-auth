package org.rean.spring_security.controller;

import lombok.RequiredArgsConstructor;
import org.rean.spring_security.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/todos")
@RequiredArgsConstructor
public class TodoController {

    private final UserService userService;
    @GetMapping
    public ResponseEntity<Object> getTodos(){
        userService.saveUserRoles();
        return new ResponseEntity<>("Create user successfully", HttpStatus.OK);
    }

}
