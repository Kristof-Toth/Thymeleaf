package com.teszt.thymeleaftest.service;

import com.teszt.thymeleaftest.dao.UserRepository;
import com.teszt.thymeleaftest.entity.Users;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersServiceImpl implements UsersService{


    private UserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Users findById(int theId) {
        return null;
    }

    @Override
    public void save(Users theUser) {
        userRepository.save(theUser);
    }

    @Override
    public void deleteById(int theId) {

    }
}
