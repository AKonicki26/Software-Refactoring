package test;
import main.*;

public class TestDrive {
    public static void main(String[] args) {
        Employee employee = new Employee("Joe", 155_000, 2026, 11, 10);

        System.out.println(employee.getSalary());

        employee.raiseSalaryBy(10);

        System.out.println(employee.getSalary());

        Manager manager = new Manager("Victor", 300_000, 2026, 11, 10);
        System.out.println(manager.getSalary());
        manager.raiseSalaryBy(10);
        System.out.println(manager.getSalary());

    }
}
