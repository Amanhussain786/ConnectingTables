package com.hindustaniBhau.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(User user)
    {
        userRepository.save(user);
        return "User Added";
    }
    public List<User> getUsers()
    {
        return userRepository.findAll();
    }

    public User getUser(int id)
    {
        return userRepository.findById(id).get();
    }

    public String deleteUser(int id)
    {
        userRepository.deleteById(id);
        return "User Deleted Susccessfully";
    }

    public String deleteAllUser()
    {
        userRepository.deleteAll();
        return "Database is Empty Now";
    }

}
