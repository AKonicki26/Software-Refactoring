package manager;

import legacy.employee.Employee;
import legacy.employee.Manager;


public class ManagerTest
{
    public static void main(String[] args)
    {
        Employee boss = new Manager("Carl Cracker", 80000, 30_000,1987, 12, 15);

        // Will throw compiler error if not cast
        if (boss instanceof Manager) {
            ((Manager)boss).setBonus(5000);
        }

        var staff = new Employee[3];

        // fill the staff array with Manager and Employee objects
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}