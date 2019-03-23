package com.itheima.domain;

public class User {
    public String Username;
    public Integer Userage;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Integer getUserage() {
        return Userage;
    }

    public void setUserage(Integer userage) {
        Userage = userage;
    }

    @Override
    public String toString() {
        return "User{" +
                "Username='" + Username + '\'' +
                ", Userage=" + Userage +
                '}';
    }
}
