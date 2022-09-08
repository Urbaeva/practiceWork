package com.company.service.impl;

import com.company.MyException;
import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.UserService;


public class UserServiceImpl implements UserService {
    private UserDao usersDao;

    public UserServiceImpl(UserDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public void addUser(User[] users) {
        usersDao.setUsers(users);
    }

    @Override
    public void findById(String id) {
        try {
            for (int i = 0; i < usersDao.getUsers().length; i++) {
                if (!usersDao.getUsers()[i].getId().equals(id)){
                    continue;
                }
                    System.out.println("Id: " + usersDao.getUsers()[i].getId());
                    System.out.println("Name: " + usersDao.getUsers()[i].getName());
                    System.out.println("Age: " + usersDao.getUsers()[i].getAge());
                    System.out.println("Gender: " + usersDao.getUsers()[i].getGender());
                    System.out.println("-------------------------");
            }
        }
        catch (MyException e) {
            System.out.println("This id #" +id+ " is not found\n");
        }
    }

    @Override
    public void deleteById(String id) {
        System.out.println("Don't print user with id #2");
        for (int i = 0; i < usersDao.getUsers().length; i++) {
            if (usersDao.getUsers()[i].getId().equals(id)) {
                i++;
            }
                System.out.println("Id: " + usersDao.getUsers()[i].getId());
                System.out.println("Name: " + usersDao.getUsers()[i].getName());
                System.out.println("Age: " + usersDao.getUsers()[i].getAge());
                System.out.println("Gender: " + usersDao.getUsers()[i].getGender());
                System.out.println("-------------------------");
        }
    }

    @Override
    public void getAllUsers() {
        System.out.println("------------ALL USERS------------");
        for (User i: usersDao.getUsers()) {
            System.out.println("Id: " + i.getId());
            System.out.println("Name: " + i.getName());
            System.out.println("Age: " + i.getAge());
            System.out.println("Gender: " + i.getGender());
            System.out.println("-------------------------");
        }
    }
}

