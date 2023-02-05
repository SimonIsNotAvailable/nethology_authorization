package com.example.nethology_authorization.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRepository {
    public Map<String,String> credentials = new HashMap<>();
    public Map<String, List<Authorities>> authorities = new HashMap<>();
    public List<Authorities> getUserAuthorities(String user, String password) {

        //for test
        String testUsername = "abcdefg";
        String testPassword = "qwerty123";
        List<Authorities> testAuthorities = new ArrayList<>();
        testAuthorities.add(Authorities.READ);
        testAuthorities.add(Authorities.WRITE);
        credentials.put(testUsername, testPassword);
        authorities.put(testUsername, testAuthorities);

        if(credentials.get(user).equals(password)) {
            return authorities.get(user);
        }
        return new ArrayList<>();
    }
}
