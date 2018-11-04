package third;

import java.util.Date;

public class Employee extends Person implements Comparable, Cloneable {
    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(){
        super();
    }

    public Employee(String name, int id){
        super(name, id);
    }

    public Employee(String name, int id, double salary, Date hireDate, String insuranceNumber){
        super(name, id);

        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getInsuranceNumber() { return insuranceNumber; }
    public void setInsuranceNumber(String insuranceNumber) { this.insuranceNumber = insuranceNumber; }

    public Date getHireDate() { return hireDate; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }

    @Override
    public String toString() {
        return String.format("%s, Salary: %f, Insurance number: %s, Hire date: %s",
                super.toString(), this.salary, this.insuranceNumber, this.hireDate.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Employee){

            Employee other = (Employee) o;

            boolean a = this.insuranceNumber.equals(other.getInsuranceNumber());
            boolean b = (this.salary == other.getSalary());
            boolean c = (this.hireDate == other.getHireDate());

            return a && b && c && super.equals(o);
        }
        else{
            return false;
        }
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {
        Employee clone = (Employee)super.clone();

        clone.hireDate = (Date)hireDate.clone();
        return clone;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;

//        return Double.compare(this.salary, other.salary);

        if (this.salary == other.salary) return 0;

        else if (this.salary > other.salary) return 1;

        else return -1;
    }
}
