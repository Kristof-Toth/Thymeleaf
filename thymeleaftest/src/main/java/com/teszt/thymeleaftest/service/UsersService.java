package com.teszt.thymeleaftest.service;

import com.teszt.thymeleaftest.entity.Users;

import java.util.List;

public interface UsersService {
    public List<Users> findAll();

    public Users findById(int theId);

    public void save(Users theUser);

    public void deleteById(int theId);
}
