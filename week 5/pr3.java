import java.util.Scanner;
import java.util.ArrayList;

class Person {

    private String name;

    public Person(){ }

    public Person(String name){
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String toString(){
        return "name: " + this.name;
    }
    public boolean equals(Person other){ return (this.name.equals(other.getName())); }
}

class Employee extends Person {

    private double salary;
    private int year;
    private String insuranceNumber;

    public Employee(){
        super();
    }

    public Employee(String name){
        super(name);
    }

    public Employee(String name, double salary, int year, String insuranceNumber){
        super(name);

        this.salary = salary;
        this.year = year;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String toString() {
        String name = super.toString();
        String salary = "salary: " + String.valueOf(this.salary);
        String number = "insurance number: " + this.insuranceNumber;
        String year = "year: " + this.year;

        return (name + ", " + salary + ", " + number + ", " + year) ;
    }

    public boolean equals(Employee other) {
        boolean a = this.insuranceNumber.equals(other.getInsuranceNumber());
        boolean b = (this.salary == other.getSalary());
        boolean c = (this.year == other.getYear());

        return a && b && c && super.equals((Person)other);
    }
}

class Manager extends Employee {

    private ArrayList<Employee> team;

    {
        team = new ArrayList<Employee>();
    }

    public Manager() { super(); }

    public Manager(String name) { super(name); }

    public Manager(String name, ArrayList<Employee> team) {
        super(name);

        this.team = team;
    }

    public Manager(String name, double salary, int year, String insuranceNumber, ArrayList<Employee> team){
        super(name, salary, year, insuranceNumber);

        this.team = team;
    }

    public ArrayList<Employee> getTeam() { return team; }
    public void setTeam(ArrayList<Employee> team){ this.team = team; }

    public void addEmployee(Employee e) {
        this.team.add(e);
    }

    public String toString() {
        String a = "Team: [";

        for (int i = 0; i < this.team.size(); i++) {
            a += this.team.get(i).getName();

            if (i == this.team.size() - 1){
                break;
            }

            a += ", ";
        }

        a += "], ";

        String b = super.toString();

        return a + " " + b;
    }

    public boolean equals(Manager other) {
        boolean a = this.team.equals(other.getTeam());

        return a & super.equals((Employee)other);
    }
}

public class pr3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person("Aza");

        System.out.println(p2.getName());
        System.out.println(p2);

        Employee e1 = new Employee("Qwe", 23, 12, "tre");

        System.out.println(e1.getInsuranceNumber() + " " + e1.getSalary() + " " + e1.getName());

        System.out.println(e1);

        Employee e2 = new Employee("Azza", 23, 12, "tre");

        System.out.println(e2.getInsuranceNumber() + " " + e2.getSalary() + " " + e2.getName() + " " + e2.getYear());

        System.out.println(e2);

        ArrayList<Employee> l = new ArrayList<Employee>();

        l.add(e1);
        l.add(e2);

        Manager m1 = new Manager("AzaM", 12, 122, "123", l);

        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println(m1.getInsuranceNumber() + " " + m1.getSalary() + " " + m1.getName() + " " + m1.getTeam());

        System.out.println(m1);

        Manager m2 = new Manager("AzaM", 12, 12, "123", l);

        m2.addEmployee(e1);
        m2.addEmployee(e2);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m2.equals(m1));
    }
}