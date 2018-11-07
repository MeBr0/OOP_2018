package second;

import java.io.Serializable;

public class Instructor implements Serializable {
    private String firstName;
    private String lastName;
    private String department;
    private String email;

    public Instructor() {

    }

    public Instructor(String firstName, String lastName, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = email;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return String.format("%s: Name - %s, Last Name - %s, Department - %s, email - %s",
                getClass(), getFirstName(), getLastName(), getDepartment(), getEmail());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Instructor) {
            Instructor other = (Instructor) obj;

            if (!lastName.equals(other.lastName)) return false;

            else if (!firstName.equals(other.firstName)) return false;

            else if (!department.equals(other.department)) return false;

            else if (!email.equals(other.email)) return false;

            else return true;
        }
        else return false;
    }
}
