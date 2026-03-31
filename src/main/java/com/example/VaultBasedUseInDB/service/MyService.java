package com.example.VaultBasedUseInDB.service;

import com.example.VaultBasedUseInDB.domain.User;
import com.example.VaultBasedUseInDB.repository.MyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    private final MyRepository repository;

    public MyService(MyRepository repository) {
        this.repository = repository;
    }

    public User addUser(User user){
        return repository.save(user);
    }

    public User getUserById(Integer id){
        return repository.getReferenceById(id);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }
 }
