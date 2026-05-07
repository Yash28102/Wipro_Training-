// ========================= Employee.java =========================

package com.employee;

public class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;
    private int rating;
    private int experience;

    public Employee(int id,
                    String name,
                    String department,
                    double salary,
                    int rating,
                    int experience) {

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.rating = rating;
        this.experience = experience;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getDepartment() {

        return department;
    }

    public double getSalary() {

        return salary;
    }

    public int getRating() {

        return rating;
    }

    public int getExperience() {

        return experience;
    }
}