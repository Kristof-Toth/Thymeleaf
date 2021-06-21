package com.teszt.thymeleaftest.dao;

import com.teszt.thymeleaftest.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
