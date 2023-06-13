package com.hindustaniBhau.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void updateUser(int id)
    {
        User user = userRepository.findById(id).orElse(null);
        user.setMobNo("123345667");
        user.setName("Aman");
        userRepository.save(user);
    }
}
  //  Employee employee = employeeRepository.findById(employeeId) .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));