package com.example.demo;

import com.example.demo.entities.User;
import com.example.demo.services.CourseService;
import com.example.demo.services.RoleService;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class Demo3Application implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private CourseService courseService;

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Mời bạn nhập Id mà bạn muốn tìm: ");
//		int id = Integer.parseInt(new Scanner(System.in).nextLine());
//		userService.findUserById(id);

//		System.out.println("Mời bạn nhập email và sđt mà bạn muốn tìm: ");
//		String email = new Scanner(System.in).nextLine();
//		String phone = new Scanner(System.in).nextLine();
//		userService.findByUserEmailAndPhone(email, phone);

//		System.out.println("Mời bạn nhập tên của role: ");
//		String name = new Scanner(System.in).nextLine();
//		roleService.findUserByRole(name);

		System.out.println("Bạn nhập thông tin của khóa học: ");
		double price = Double.parseDouble(new Scanner(System.in).nextLine());
		String timeLine = new Scanner(System.in).nextLine();
		int vote = Integer.parseInt(new Scanner(System.in).nextLine());
		courseService.findCourseByMonthAndPriceAndVote(price,timeLine,vote);
	}
}
