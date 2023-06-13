package com.hindustaniBhau.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user)
    {
        return userService.addUser(user);
    }
    @GetMapping("/get_users")
    public List<User> getUsers()
    {
        return userService.getUsers();
    }
    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id)
    {
        return userService.getUser(id);
    }
    @DeleteMapping("/delete")
    public String deleteUser(@RequestParam("id") int id)
    {
         userService.deleteUser(id);
         return "User Deleted Successfully";
    }

    @DeleteMapping("/delete_all")
    public String deleteAllUser()
    {
        userService.deleteAllUser();
        return "Database is Empty Now";
    }
    @PutMapping("/update")
    public String updateUser(@RequestParam("id") int id)
    {
        userService.updateUser(id);
        return "User is Successfully Updated";
    }
}
