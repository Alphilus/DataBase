package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface UserRespository extends JpaRepository<User, Integer> {
    @Query(value = "select * from User where roleId=?", nativeQuery = true)
    User findByRoleId(Integer roleId);

    @Query(value = "select * from User where email=? and phone=?" , nativeQuery = true)
    User findByUserEmailAndPhone(String email, String phone);

    @Query(value = "select * from User where name=?", nativeQuery = true)
    User findUserByName(String name);

    @Query(value = "select * from User where id=?", nativeQuery = true)
    User findUserById(Integer id);

    @Query(value = "select * from User where phone=?",nativeQuery = true)
    User findUserByPhone(String phone);

    @Modifying
    @Transactional
    @Query(value = "insert into User(name,phone,email) values(?) ", nativeQuery = true)
    void insertUser(String nane, String phone, String email);

    @Modifying
    @Transactional
    @Query(value = "delete from User where name=?",nativeQuery = true)
    User deleteUser(String name);

    @Modifying
    @Transactional
    @Query(value = "update User set name = ?2, phone = ?3, email = ?4 where id=?1")
    User updateUser(Integer id, String name, String phone, String email);
}
