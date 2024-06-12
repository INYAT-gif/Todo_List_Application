package se.inyat.todo_list_application.startup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.inyat.todo_list_application.data.entity.Role;
import se.inyat.todo_list_application.repository.RoleRepository;

@Component
public class RoleDataLoader implements CommandLineRunner {


    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        // execute this logic...
        // How to call save method of RoleRepository Interface?
        roleRepository.save(new Role("ADMIN"));
        roleRepository.save(new Role("USER"));
        roleRepository.save(new Role("GUEST"));
        // add more roles as needed
    }


}