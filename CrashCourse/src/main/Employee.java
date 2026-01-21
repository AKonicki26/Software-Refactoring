package main;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDate;

    public Employee(String name, double salary, int hireYear, int hireMonth, int hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalaryBy(double percentRaise) {
        salary += getSalary() * (percentRaise / 100);
    }

    @Override
    public String getDescription() {
        return "I am an employee, " + name + " my salary is " + getSalary();
    }
}
