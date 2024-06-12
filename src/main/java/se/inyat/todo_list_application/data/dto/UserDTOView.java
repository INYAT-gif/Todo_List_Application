package se.inyat.todo_list_application.data.dto;


import lombok.*;

import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTOView {

    private String email;
    private Set<RoleDTOView> roles;
}