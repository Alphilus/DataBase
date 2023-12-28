package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRespository extends JpaRepository<User, Integer> {
    @Query(value = "select * from User where roleId=?", nativeQuery = true)
    User findByRoleId(Integer roleId);

    @Query(value = "select * from User where email=? and phone=?" , nativeQuery = true)
    User findByUserEmailAndPhone(String email, String phone);
}
