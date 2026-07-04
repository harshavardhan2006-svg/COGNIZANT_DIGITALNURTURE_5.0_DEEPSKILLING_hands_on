package com.cognizant.jwthandson.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;

public class JwtUtil {

    private static final Key SECRET_KEY =
            Keys.secretKeyFor(SignatureAlgorithm.HS256);

    public static String generateToken(String username) {

        long currentTime = System.currentTimeMillis();

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(currentTime))
                .setExpiration(new Date(currentTime + 600000))
                .signWith(SECRET_KEY)
                .compact();

    }

}