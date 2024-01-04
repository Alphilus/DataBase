package com.example.demo.view;

import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class SchoolMenu {
    @Autowired
    private UserService userService;

    public void menu(Scanner scanner){
        System.out.println("Menu");

        System.out.println("1-Insert New User");
        System.out.println("2-Delete a User");
        System.out.println("3-Update User");
        System.out.println("4-Find a User");

        int input = Integer.parseInt(new Scanner(System.in).nextLine());

        switch (input){
            case 1:
                insertUser(scanner);
                break;
            case 2:
                deleteUser(scanner);
                break;
            case 3:
                updateUser(scanner);
                break;
            case 4:
                findUserByPhone(scanner);
                break;
            default:
                System.out.println("Mời bạn nhập lại");
                menu(scanner);
        }
    }

    public void insertUser(Scanner scanner){
        System.out.println("Insert a New User: ");

        System.out.println("User name:");
        String name = new Scanner(System.in).nextLine();

        System.out.println("User phone number:");
        String phone = new Scanner(System.in).nextLine();

        System.out.println("User email:");
        String email = new Scanner(System.in).nextLine();

        userService.insertUser(name,phone,email);
    }

    public void deleteUser(Scanner scanner){
        System.out.println("Select a User to delete");
        String name = new Scanner(System.in).nextLine();

        userService.findUserByNameToDelete(name);
    }

    public void updateUser(Scanner scanner){
        System.out.println("Select the ID to Update: ");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.println("Update Name: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Update Phone Number: ");
        String phone = new Scanner(System.in).nextLine();
        System.out.println("Update Email: ");
        String email = new Scanner(System.in).nextLine();


        userService.updateUser(id, name, phone, email);
    }

    public void findUserByPhone(Scanner scanner){
        System.out.println("Enter Phone Number:");
        String phone = new Scanner(System.in).nextLine();

        userService.findUserByPhone(phone);
    }
}
