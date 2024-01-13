package com.example.demo.repository;

import com.example.demo.dto.BankingDTO;
import com.example.demo.dto.CourseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
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
    void insertUser(String name, String phone, String email);

    @Modifying
    @Transactional
    @Query(value = "delete from User where name=?",nativeQuery = true)
    User deleteUser(String name);

    @Modifying
    @Transactional
    @Query(value = "update User set name = ?2, phone = ?3, email = ?4 where id=?1")
    User updateUser(Integer id, String name, String phone, String email);

    @Query("select new com.example.demo.dto.UserDTO(u.email, u.phone, r.name) from User u join Role r on u.roleId = r.id")
    List<UserDTO> findUserAndRole();

    @Query("select new com.example.demo.dto.BankingDTO(u.email,u.phone,a.accountNum,a.nameBank) from User u join AccountBanking a on u.id = a.id")
    List<BankingDTO> findUsersAndBank();

    @Query("select new com.example.demo.dto.CourseDTO(u.email,u.phone,c.name,c.timeLine) from  User u join Course c on u.id = c.id")
    List<CourseDTO> findUserAndCourse();
}
