package com.infinity.user.ms_user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class UserDTO {
    private String document;
    private String name;
    private String lastname;
    private String email;
    private String phone;
}
