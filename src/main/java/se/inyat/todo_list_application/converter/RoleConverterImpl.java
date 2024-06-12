package se.inyat.todo_list_application.converter;

import org.springframework.stereotype.Component;
import se.inyat.todo_list_application.controller.RoleController;
import se.inyat.todo_list_application.data.dto.RoleDTOView;
import se.inyat.todo_list_application.data.entity.Role;

@Component
public class RoleConverterImpl implements RoleConverter {

    @Override
    public RoleDTOView toRoleDTOView(Role entity) {
        return RoleDTOView.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
        //return new RoleDTOView(entity.getId(), entity.getName());
    }

    @Override
    public Role toRoleEntity(RoleDTOView dtoView) {
        return Role.builder().id(dtoView.getId()).name(dtoView.getName()).build();
        //return new Role(dtoView.getId(), dtoView.getName());
    }
}