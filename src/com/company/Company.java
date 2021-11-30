package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {

    private int income;
    ArrayList<Employee> listOFEmployee = new ArrayList<Employee>();

    public void hire(Employee employee){
        listOFEmployee.add(employee);
    }

    public void hireAll(ArrayList<Employee> arrayList){
        listOFEmployee.addAll(arrayList);
    }

    public void fire(int number){
        listOFEmployee.remove(number);
    }

    public int getIncome() {
        return income;
    }

    public ArrayList<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> sortList = new ArrayList<Employee>();
        sortList.addAll(listOFEmployee);

        sortList.sort(Comparator.comparingDouble(o -> o.calcSalary(o.baseSalary)));

        sortList.removeIf(i -> sortList.indexOf(i) > Math.abs(count-1));

        return sortList;
    }

    public ArrayList<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> sortList = new ArrayList<Employee>();
        sortList.addAll(listOFEmployee);

        sortList.sort(Comparator.comparingDouble(o -> o.calcSalary(o.baseSalary)));
        Collections.reverse(sortList);

        sortList.removeIf(i -> sortList.indexOf(i) > Math.abs(count-1));

        return sortList;
    }

    public ArrayList<Employee> getListOFEmployee() {
        return listOFEmployee;
    }

    public void setIncome(int income) {
        this.income = income;
    }

}