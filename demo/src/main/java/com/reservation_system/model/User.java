package com.reservation_system.model;

public abstract class User {
    protected int id;
    protected String name;
    protected String email;
    protected String password;
    protected boolean approved;

    public User(int id, String name, String email, String password, boolean approved) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.approved = approved;
    }

    public int getID() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public boolean isApproved() { return approved; }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public abstract String getUserType();


    //Placeholder for when departmental approval
    public boolean requiresDepartmentApproval() {
        String type = getUserType().toLowerCase();
        return type.equals("student") || type.equals("faculty") || type.equals("researcher");
    }
}