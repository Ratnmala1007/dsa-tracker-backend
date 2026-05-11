package com.dsa.tracker.controller;


import com.dsa.tracker.entity.User;
import com.dsa.tracker.repository.UserRepository;
import com.dsa.tracker.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
//@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // 🔐 Login API
    @PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> request) {

        String username = request.get("username");
        String password = request.get("password");

        // Authenticate user
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(username, password)
        );

        // Generate token
        String token = jwtUtil.generateToken(username);

        // Return token
        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }
    @PostMapping("/register")
    public String register(@RequestBody User user) {

        // Check existing user
        if (userRepository.existsByUsername(user.getUsername())) {
            return "Username already exists";
        }

        // Encode password
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // Save user
        userRepository.save(user);

        return "User registered successfully";
    }
}