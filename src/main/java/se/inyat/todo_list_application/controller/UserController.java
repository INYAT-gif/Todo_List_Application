package se.inyat.todo_list_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.inyat.todo_list_application.data.dto.UserDTOForm;
import se.inyat.todo_list_application.data.dto.UserDTOView;
import se.inyat.todo_list_application.service.UserService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin(origins = "http://localhost:3000") // Replace with your frontend URL
@RequestMapping("/api/v1/users")
@RestController // RestController annotation is used to create RESTful web services
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<UserDTOView> doGetUserByEmail(@RequestParam String email) {
        System.out.println(">>>>>> getUserByEmail has been executed!");
        System.out.println("Email:" + email);
        UserDTOView responseBody = userService.getByEmail(email);

        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @PostMapping
    public ResponseEntity<UserDTOView> doRegister(@RequestBody UserDTOForm userDTOForm) {
        System.out.println("DTO FORM:" + userDTOForm);

        UserDTOView responseBody = userService.register(userDTOForm);
        return ResponseEntity.status(HttpStatus.CREATED).body(responseBody);

    }


    @PutMapping("/disable")
    public ResponseEntity<Void> doDisableUserByEmail(@RequestParam("email") String email) {
        userService.disableByEmail(email);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/enable")
    public ResponseEntity<Void> doEnableUserByEmail(@RequestParam("email") String email) {
        userService.enableByEmail(email);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}