package com.nisum.nisumuser.DTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDTO {

    private Long id;
    private String email;
    private String password;
}
