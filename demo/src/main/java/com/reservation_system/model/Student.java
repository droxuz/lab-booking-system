package com.reservation_system.model;

public class Student extends User {
    public Student(int id, String name, String email, String password, boolean approved){
        super(id, name, email, password, approved);
    }

    @Override
    public String getUserType() {
        return "Student";
    }
}
