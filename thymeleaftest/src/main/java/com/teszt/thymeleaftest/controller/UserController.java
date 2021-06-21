package com.teszt.thymeleaftest.controller;

import com.teszt.thymeleaftest.entity.Users;
import com.teszt.thymeleaftest.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UsersService usersService;

    @GetMapping("/saveUserForm")
    public String saveUser(Model theModel){

        //create model attribute to bind form data
        Users theUser = new Users();

        theModel.addAttribute("user", theUser);

        return "users/saveUserForm";
    }


}
