package com.jemo.RestaurantReviewPortal.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse{
    private Long id;
    private String username;
    private String email;
    private String role;
}
