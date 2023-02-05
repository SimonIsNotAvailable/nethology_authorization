package com.example.nethology_authorization.controller;

import com.example.nethology_authorization.Exceptions.InvalidCredentials;
import com.example.nethology_authorization.Exceptions.UnauthorizedUser;
import com.example.nethology_authorization.repository.Authorities;
import com.example.nethology_authorization.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorizationController {
    AuthorizationService service;

    @Autowired
    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@RequestParam("user") String user, @RequestParam("password") String password) {
        return service.getAuthorities(user, password);
    }
    @GetMapping("/error")
    public AuthorizationService throwSomeException() {
        throw new RuntimeException();
    }

    @ExceptionHandler(InvalidCredentials.class )
    public ResponseEntity<String> invalidCredentialsException() {
        return new ResponseEntity<>("BadRequest", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(UnauthorizedUser.class )
    public ResponseEntity<String> unauthorizedUserException() {
        return new ResponseEntity<>("Unauthorized", HttpStatus.UNAUTHORIZED);
    }
}