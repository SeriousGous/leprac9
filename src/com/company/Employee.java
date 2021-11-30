package com.company;

public abstract class  Employee implements EmployeePosition{
    protected String firstName;
    protected String secondName;
    protected final int baseSalary = 50000;
    protected String position;
    protected Company company;

    public Employee(String firstName, String secondName, String position, Company company) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.company = company;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return 0;
    }
}