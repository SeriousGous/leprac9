package com.company;

public class TopManager extends Employee implements  EmployeePosition{

    private double percent = 1.5;

    @Override
    public String getJobTitle() {
        return position;
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.getIncome() > 10000000)
            return baseSalary+baseSalary*percent;
        return baseSalary;
    }

    public TopManager(String firstName, String secondName, String position, Company company) {
        super(firstName, secondName, position, company);
    }
}