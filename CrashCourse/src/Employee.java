import java.time.LocalDate;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    Employee(String name, double salary, int hireYear, int hireMonth, int hireDay) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalaryBy(double percentRaise) {
        salary += salary * (percentRaise / 100);
    }
}
