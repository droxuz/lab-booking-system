package com.reservation_system.model;

public abstract class user {
    protected int id;
    protected String name;
    protected String email;
    protected String password;

    public user(int id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public abstract String getUserType();

    @Override
    public String toString(){
        return id + "," + name + "," + email + "," + getUserType();
    }
}
