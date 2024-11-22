package com.welldex.apirestwelldex.service.impl;

import com.welldex.apirestwelldex.repository.UserRepository;
import com.welldex.apirestwelldex.security.jwt.JwtUtil;
import com.welldex.apirestwelldex.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<String> login(Map<String, String> requestMap) {
        log.info("Inicia proceso de login");
        try {
            Authentication authentication;
        } catch (Exception exception) {
            log.info("{}", exception);
        }

        return new ResponseEntity<String>("{\"mensaje\":\""+" Credenciales incorrectas "+"\"}", HttpStatus.BAD_REQUEST);
    }
}
