package com.jemo.RestaurantReviewPortal.auth;

public record RegisterRequest(
        String username,
        String email,
        String password
) {}
