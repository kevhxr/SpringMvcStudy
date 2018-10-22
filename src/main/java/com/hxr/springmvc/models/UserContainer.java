package com.hxr.springmvc.models;

import java.util.List;

public class UserContainer {

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers( List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UserContainer{" + "users=" + users+ '}';
    }

}
