package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Company c = new Company();
        c.setIncome(20000000);

        String[] name = {"John", "Doe", "Marlyn","Johnson","Kate","Watson","Bill","Waller","Mary","Babbage","Henry","Briggs"};

        for (int i = 0; i < 180; i++){
            Random r = new Random();
            c.hire(new Operator(name[r.nextInt(name.length)],name[r.nextInt(name.length)],"Operator",c));
        }

        for (int i = 0; i < 80; i++){
            Random r = new Random();
            c.hire(new Manager(name[r.nextInt(name.length)],name[r.nextInt(name.length)],"Manager",c));
        }

        for (int i = 0; i < 10; i++){
            Random r = new Random();
            c.hire(new TopManager(name[r.nextInt(name.length)],name[r.nextInt(name.length)],"TopManager",c));
        }

        c.getTopSalaryStaff(12).forEach(s -> System.out.println(s.calcSalary(s.baseSalary)));
        System.out.println();
        c.getLowestSalaryStaff(30).forEach(s -> System.out.println(s.calcSalary(s.baseSalary)));

        System.out.println();

        final int countOfOriginalEmployee = 180+80+10;

        while(c.getListOFEmployee().size() > countOfOriginalEmployee)
        {
            Random r = new Random();
            c.fire(r.nextInt(c.getListOFEmployee().size()));
        }

        c.getTopSalaryStaff(12).forEach(s -> System.out.println(s.calcSalary(s.baseSalary)));
        System.out.println();
        c.getLowestSalaryStaff(30).forEach(s -> System.out.println(s.calcSalary(s.baseSalary)));

    }
}