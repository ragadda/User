package com.example.User.service;

import com.example.User.model.User;
import com.example.User.poll.PollService;
import com.example.User.repository.UserRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositoryImpl userRepository;
    @Autowired
    private PollService pollService;



     @Override
     public Integer createUser(User user) {
      if(user.getFirstName() != null && user.getLastName() != null){
          System.out.println("create user" );
           return userRepository.createUser(user);
      }else{
          System.out.println("can't create user without name and lastname");
          return -1;
      }
     }

    @Override
    public void deleteUserById(Integer userId) {
        userRepository.deleteUserById(userId);
        //System.out.println(pollService.getUserAnswer(userId)!=null);
        if (pollService.getUserAnswer(userId)!=null){
            pollService.deleteAllUserAnswers(userId);
        }
    }


    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        userRepository.updateUserFirstName(id,firstName);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        userRepository.updateUserLastName(id,lastName);
    }

    @Override
    public void updateUserEmail(Integer id, String email) {
        userRepository.updateUserEmail(id,email);
    }

    @Override
    public void updateUserAge(Integer id, Integer age) {
         userRepository.updateUserAge(id,age);
    }

    @Override
    public void updateUserAddress(Integer id, String address) {
         userRepository.updateUserAddress(id,address);
    }


    @Override
    public User getUserById(Integer id) {
         return userRepository.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }


}//endclass
