package com.company.dao;

import com.company.model.User;

public class UserDao {
    private User[] users;

    public UserDao(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

}
