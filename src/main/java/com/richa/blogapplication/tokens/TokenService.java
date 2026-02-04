package com.richa.blogapplication.tokens;

import org.springframework.stereotype.Service;

@Service
public interface TokenService {
    String createAuthToken(String userName);

    String getUserNameFromToken(String token);
}