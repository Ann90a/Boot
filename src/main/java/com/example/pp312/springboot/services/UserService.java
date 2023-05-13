package com.example.pp312.springboot.services;


import com.example.pp312.springboot.model.User;


import java.util.List;

public interface UserService {
    void saveUser(User user);

    User getUser(long id);

    List<User> getAllUser();

    void delete(long id);

}
