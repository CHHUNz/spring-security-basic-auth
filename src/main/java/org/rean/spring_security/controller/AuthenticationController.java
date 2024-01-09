package org.rean.spring_security.controller;

import lombok.RequiredArgsConstructor;
import org.rean.spring_security.model.request.AuthenticationRequest;
import org.rean.spring_security.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @PostMapping(value = "create")
    public ResponseEntity<Object> create(AuthenticationRequest authenticationRequest){
        return new ResponseEntity<>(authenticationRequest, HttpStatus.CREATED);

    }
}
