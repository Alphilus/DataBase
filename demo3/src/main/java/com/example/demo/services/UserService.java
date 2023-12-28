package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRespository userRespository;
    public void findByUserEmailAndPhone(String email, String phone){
        User user = userRespository.findByUserEmailAndPhone(email, phone);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }
    public void findUserByRoleId(Integer roleId){
        User user = userRespository.findByRoleId(roleId);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }
}
