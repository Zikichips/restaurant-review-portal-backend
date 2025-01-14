package com.jemo.RestaurantReviewPortal.user;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.springframework.lang.NonNull;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "user_table")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") // help prevent infinite loop
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    @NonNull
    @NotEmpty(message = "username cannot be empty")
    private String username;

    @Email
    @NonNull
    @NotEmpty(message = "email cannot be empty")
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @NonNull
    @NotEmpty(message = "password cannot be empty")
    private String password;

    @Column(nullable = false, length = 50)
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
