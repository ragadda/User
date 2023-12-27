package com.example.User.repository;

import com.example.User.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {

    Integer createUser(User user);
    void deleteUserById(Integer id);
    void updateUserFirstName(Integer id, String firstName);
    void updateUserLastName(Integer id, String lastName);
    void updateUserEmail(Integer id, String email);
    void updateUserAge(Integer id,Integer age);
    void updateUserAddress(Integer id,String address);

    User getUserById(Integer id);
    List<User> getAllUsers();
}//end class
