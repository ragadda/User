package com.example.User.repository;

import com.example.User.model.User;
import com.example.User.repository.mapper.UserMapper;
import com.example.User.ulits.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Integer createUser(User user) {
        String sql = "INSERT INTO " + Constant.USER_TABLE_NAME + " (first_name,last_name,email,age,address) VALUES ( ?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getAge(),
                user.getAddress());
    }

    @Override
    public void deleteUserById(Integer id) {
        String sql = "DELETE FROM "+ Constant.USER_TABLE_NAME+" WHERE id = ?";
        jdbcTemplate.update(sql,id);
    }



    @Override
    public void updateUserFirstName(Integer id, String firstName) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET first_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,firstName,id);
    }

    @Override
    public void updateUserLastName(Integer id, String lastName) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET last_name = ? WHERE id = ?";
        jdbcTemplate.update(sql,lastName,id);
    }

    @Override
    public void updateUserEmail(Integer id, String email) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET email = ? WHERE id = ?";
        jdbcTemplate.update(sql,email,id);
    }

    @Override
    public void updateUserAge(Integer id,Integer age) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET age = ? WHERE id = ?";
        jdbcTemplate.update(sql,age,id);
    }

    @Override
    public void updateUserAddress(Integer id,String address) {
        String sql = "UPDATE "+ Constant.USER_TABLE_NAME +" SET address = ? WHERE id = ?";
        jdbcTemplate.update(sql,address,id);

    }

    @Override
    public User getUserById(Integer id) {
        try {
            String sql = "SELECT * FROM " + Constant.USER_TABLE_NAME + " WHERE id = ?";
            return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM "+ Constant.USER_TABLE_NAME;
        return jdbcTemplate.query(sql,new UserMapper());
    }

}//end class
