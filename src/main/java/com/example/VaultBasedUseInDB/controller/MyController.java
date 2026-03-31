package com.example.VaultBasedUseInDB.controller;

import com.example.VaultBasedUseInDB.service.MyService;
import com.example.VaultBasedUseInDB.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vault/api/user")
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return myService.addUser(user);
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return myService.getAllUsers();
    }

    @GetMapping("/getUserById")
    public User getUserById(@RequestParam("id") Integer id) {
        return myService.getUserById(id);
    }
}
