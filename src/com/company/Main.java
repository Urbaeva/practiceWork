package com.company;

import com.company.dao.UserDao;
import com.company.enums.Gender;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("1", "User1", 20, Gender.FEMALE);
        User user2 = new User("2", "User2", 20, Gender.MALE);
        User user3 = new User("3", "User3", 20, Gender.FEMALE);

        User[] users = {user1, user2, user3};

        UserDao userDao = new UserDao(users);

        UserServiceImpl userService = new UserServiceImpl(userDao);

        userService.addUser(users);
        Scanner scanner = new Scanner(System.in);


        System.out.println("---If you want to ---\n---find user by id, enter 1\n---delete 2\n---print all users 3: ");
        int n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Enter user's id: ");
                    String id = scanner.next();
                    userService.findById(id);
                }
                case 2 -> {
                    System.out.print("Delete by id: ");
                    String id = scanner.next();
                    userService.deleteById(id);
                }
                case 3 -> userService.getAllUsers();
            }
    }
}
