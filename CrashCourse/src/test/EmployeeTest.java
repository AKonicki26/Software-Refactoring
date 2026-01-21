package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Employee;
import main.Manager;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    void raiseSalarySuccessful() {
        var startingSalary = 200_000;
        Employee employee = new Employee("Joe", startingSalary, 2026, 11, 10);
        assertEquals(startingSalary, employee.getSalary());

        employee.raiseSalaryBy(10);

        var expectedSalary = 220_000;
        assertEquals(expectedSalary, employee.getSalary());
    }

    @Test
    void calculateBonusSuccessful() {
        var startingSalary = 300_000;
        var bonus = 33_000;
        Manager manager = new Manager("Victor", startingSalary, 2026, 11, 10);
        manager.setBonus(bonus);

        assertEquals(manager.getSalary(), startingSalary + bonus);
    }
}
