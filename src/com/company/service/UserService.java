package com.company.service;

import com.company.dao.UserDao;
import com.company.model.User;

public interface UserService {
    void addUser(User[] users);
    void findById(String id);
    void deleteById(String id);
    void getAllUsers();
}