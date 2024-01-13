package com.example.demo.services;

import com.example.demo.entities.Role;
import com.example.demo.repository.RoleRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    private RoleRespository roleRespository;
    public void findRoleByName(String name){
        Role role = roleRespository.findRoleByName(name);
        if (role!=null)
            System.out.println(role);
        else System.out.println("Không tìm thấy name của role:");
    }

    public void findUserByRole(String name){
        Role role = roleRespository.findRoleByName(name);
            if (role != null) {
                System.out.println(role);
            } else System.out.println("Không tìm thấy name của role:");
    }
}
