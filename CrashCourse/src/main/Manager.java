package main;


public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary,  int hireYear, int hireMonth, int hireDay) {
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
