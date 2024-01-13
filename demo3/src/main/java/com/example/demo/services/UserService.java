package com.example.demo.services;

import com.example.demo.dto.BankingDTO;
import com.example.demo.dto.CourseDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class UserService {
    Scanner scanner = new Scanner(System.in);
    @Autowired
    private UserRepository userRepository;
    public void findByUserEmailAndPhone(String email, String phone){
        User user = userRepository.findByUserEmailAndPhone(email, phone);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }

    public void findUserByNameToDelete(String name){
        User user = userRepository.findUserByName(name);
        if (user!=null)
            deleteUser(name);
        else System.out.println("Không tìm thấy User");
    }

    public void findUserByRoleId(Integer roleId){
        User user = userRepository.findByRoleId(roleId);
        if (user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user Id:");
    }

    public void findUserByPhone(String phone){
        User user = userRepository.findUserByPhone(phone);
        if (user!=null)
            System.out.println(user);
        else System.out.println("User not found");
    }

    public void insertUser(String name, String phone, String email){
        userRepository.insertUser(name, phone, email);
    }

    public void deleteUser(String name){
        userRepository.deleteUser(name);
    }

    public void updateUser(Integer id, String name, String phone, String email){
        userRepository.updateUser(id,name,phone,email);
    }

    public void findUserAndRole(){
        List<UserDTO> userDTOS = userRepository.findUserAndRole();
        System.out.println("========");
        System.out.println(userDTOS);
    }

    public void findUsersAndBank(){
        List<BankingDTO> bankingDTOS = userRepository.findUsersAndBank();
        System.out.println("====================================");
        System.out.println(bankingDTOS);
    }

    public void findUserAndCourse(){
        List<CourseDTO> courseDTOS = userRepository.findUserAndCourse();
        System.out.println("====================================");
        System.out.println(courseDTOS);
    }
}
