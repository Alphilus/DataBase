package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Scanner;

@Service
public class UserService {
    Scanner scanner = new Scanner(System.in);
    @Autowired
    private UserRespository userRespository;
    public void findByUserEmailAndPhone(String email, String phone){
        User user = userRespository.findByUserEmailAndPhone(email, phone);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }

    public void findUserByNameToDelete(String name){
        User user = userRespository.findUserByName(name);
        if (user!=null)
            deleteUser(name);
        else System.out.println("Không tìm thấy User");
    }

    public void findUserByRoleId(Integer roleId){
        User user = userRespository.findByRoleId(roleId);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }

    public void findUserByPhone(String phone){
        User user = userRespository.findUserByPhone(phone);
        if (user!=null)
            System.out.println(user);
        else System.out.println("User not found");
    }

    public void insertUser(String name, String phone, String email){
        userRespository.insertUser(name, phone, email);
    }

    public void deleteUser(String name){
        userRespository.deleteUser(name);
    }

    public void updateUser(Integer id, String name, String phone, String email){
        userRespository.updateUser(id,name,phone,email);
    }
}
