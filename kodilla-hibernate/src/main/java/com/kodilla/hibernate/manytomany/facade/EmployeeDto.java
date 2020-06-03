package com.kodilla.hibernate.manytomany.facade;

public class EmployeeDto {
    private String firstname;
    private String lastname;

    public EmployeeDto(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
