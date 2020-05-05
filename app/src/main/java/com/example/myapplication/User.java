package com.example.myapplication;

import androidx.annotation.Nullable;

public class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this)
            return true;
        if (obj.getClass() != this.getClass())
            return false;
        User tempUser = (User) obj;
        return this.getUsername().equals(((User) obj).getUsername());
    }
}
