package se.inyat.todo_list_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.inyat.todo_list_application.data.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {



}
