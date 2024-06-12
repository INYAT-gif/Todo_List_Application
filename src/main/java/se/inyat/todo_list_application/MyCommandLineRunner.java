package se.inyat.todo_list_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.inyat.todo_list_application.repository.UserRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    public void run(String...args) throws Exception {

    }
}