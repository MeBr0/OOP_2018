package pr3;

public class Employee {
    private String name;
    public int salary;

    public Employee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }

    public void raiseSalary(int x) {
        salary += x;
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + "Salary: " + salary;
    }
}