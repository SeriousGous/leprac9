package com.company;

public class Manager extends Employee implements  EmployeePosition {

    private final double percent = 0.05;

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        int moneyForCompany = (int)((Math.random()*25000) + 115000);
        return baseSalary+moneyForCompany*percent;
    }

    public Manager(String firstName, String secondName, String position, Company company) {
        super(firstName, secondName, position, company);
    }
}