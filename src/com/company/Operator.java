package com.company;

public class Operator extends Employee implements  EmployeePosition{

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }

    public Operator(String firstName, String secondName, String position, Company company) {
        super(firstName, secondName, position, company);
    }
}