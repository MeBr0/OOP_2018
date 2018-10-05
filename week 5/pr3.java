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

    public boolean equals(Object object){
        if (object instanceof Person){
            Person other = (Person) object;
            return (this.name.equals(other.getName()));
        }
        else{
            return false;
        }
    }
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

    public boolean equals(Object object) {
        if (object instanceof Employee){
            Employee other = (Employee) object;
            boolean a = this.insuranceNumber.equals(other.getInsuranceNumber());
            boolean b = (this.salary == other.getSalary());
            boolean c = (this.year == other.getYear());

            return a && b && c && super.equals((Person)other);
        }
        else{
            return false;
        }

    }
}

class Manager extends Employee {

    private ArrayList<Employee> team;
    private int bonus;

    {
        bonus = 0;
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

    public int getBonus() { return bonus; }

    public void addEmployee(Employee e) {
        this.team.add(e);
    }

    public void addBonus(int a){
        this.bonus += a;
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

        String b = "Bonus: " + String.valueOf(this.bonus);

        String c = super.toString();

        return a + " " + b + " " + c;
    }

    public boolean equals(Object object) {
        if (object instanceof Manager){
            Manager other = (Manager) object;
            boolean a = this.team.equals(other.getTeam());
            boolean b = (this.bonus == other.bonus);

            return a & b & super.equals((Employee)other);
        }
        else {
            return false;
        }

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

        Manager m2 = new Manager("AzaM", 12, 122, "123", l);

        m2.addEmployee(e1);
        m2.addEmployee(e2);

        System.out.println(m1);
        System.out.println(m2);

        System.out.println(m2.equals(m1));
    }
}