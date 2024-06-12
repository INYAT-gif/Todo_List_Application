package se.inyat.todo_list_application.converter;

import se.inyat.todo_list_application.data.dto.RoleDTOView;
import se.inyat.todo_list_application.data.entity.Role;

public interface RoleConverter {
    RoleDTOView toRoleDTOView(Role entity);

    Role toRoleEntity(RoleDTOView dtoView);
}
