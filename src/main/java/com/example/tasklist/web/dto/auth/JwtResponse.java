package com.example.tasklist.web.dto.auth;

import lombok.Data;

@Data
public class JwtResponse {
    private Long id;
    private String accessToken;
    private String refreshToken;
}
