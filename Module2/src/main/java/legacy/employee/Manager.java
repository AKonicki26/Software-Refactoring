package legacy.employee;

public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, double bonus, int hireYear, int hireMonth, int hireDay) {
        super(name, salary, hireYear, hireMonth, hireDay);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}