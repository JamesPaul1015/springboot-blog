package com.codeup.springbootblog.controllers;

public class Post {
    private User user;
    private long id;

    public void setUser(User user) {
        this.user = user;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
