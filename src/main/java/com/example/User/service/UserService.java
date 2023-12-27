package com.example.User.service;

import com.example.User.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    Integer createUser(User user);
    void deleteUserById(Integer id);
    void updateUserFirstName(Integer id, String firstName);
    void updateUserLastName(Integer id, String lastName);
    void updateUserEmail(Integer id, String email);
    void updateUserAge(Integer id,Integer age);
    void updateUserAddress(Integer id,String address);

    User getUserById(Integer id);
    List<User> getAllUsers();
}//endclass
