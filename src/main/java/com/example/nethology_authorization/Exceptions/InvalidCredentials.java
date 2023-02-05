package com.example.nethology_authorization.Exceptions;



public class InvalidCredentials extends RuntimeException {


    public InvalidCredentials(String msg) {
        super(msg);
    }
}
