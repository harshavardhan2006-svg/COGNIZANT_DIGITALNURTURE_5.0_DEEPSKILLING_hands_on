package com.cognizant.jwthandson.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwthandson.model.JwtResponse;
import com.cognizant.jwthandson.util.JwtUtil;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {

        LOGGER.info("START Authentication");

        String authorization =
                request.getHeader("Authorization");

        if (authorization == null ||
                !authorization.startsWith("Basic ")) {

            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Authorization Header Missing");

        }

        String base64 =
                authorization.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(base64);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values =
                credentials.split(":", 2);

        String username = values[0];

        String password = values[1];

        if ("user".equals(username) &&
                "pwd".equals(password)) {

            String token =
                    JwtUtil.generateToken(username);

            LOGGER.info("END Authentication");

            return ResponseEntity.ok(new JwtResponse(token));

        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid Credentials");

    }

}