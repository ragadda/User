package com.example.User.controller;

import com.example.User.model.User;
import com.example.User.service.UserServiceImpl;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PutMapping(value = "/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @PutMapping(value = "/update_first_name")
    public void updateUserFirstName(@RequestParam Integer id, @RequestParam(value = "first_name") String firstName){
        userService.updateUserFirstName(id,firstName);
    }
    @PutMapping(value = "/update_last_name")
    public void updateUserLastName(@RequestParam Integer id,@RequestParam(value = "last_name") String lastName){
        userService.updateUserLastName(id,lastName);
    }

    @PutMapping(value = "/update_age")
    public void updateUserEmail(@RequestParam Integer id,@RequestParam Integer age){
        userService.updateUserAge(id,age);
    }

    @PutMapping(value = "/update_address")
    public void updateUserEmail(@RequestParam Integer id,@RequestParam String address){
       userService.updateUserAddress(id,address);
    }
    @DeleteMapping(value = "/delete")
    public void deleteUserById(@RequestParam Integer id){
       userService.deleteUserById(id);
    }

    @GetMapping(value = "/by_id")
    public User getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
       return userService.getAllUsers();
    }

}//end class
