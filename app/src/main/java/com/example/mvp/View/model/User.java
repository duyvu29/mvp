package com.example.mvp.View.model;

public class User {
    /** presenter giao tiếp với View qua interface**/
    private String name ;
    private String passord;

    public User(String name, String passord) {
        this.name = name;
        this.passord = passord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassord() {
        return passord;
    }

    public void setPassord(String passord) {
        this.passord = passord;
    }
}
