package pr3;

import java.io.*;
import java.util.Vector;

public class Manager extends Employee {
    public Vector<Employee> team;
    private int bonus;

    private static final String TEAM = "team.out";

    private static final String FILE_EXCEPT = "not found!";
    private static final String IO_EXCEPT = "input/output exception!";
    private static final String CLASS_EXCEPT = "class not found!";

    public Manager(String name, int salary, Vector<Employee> team, int bonus) {
        super(name, salary);

        this.team = team;
        this.bonus = bonus;
    }

    public void setBonus(int bonus) { this.bonus = bonus; }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void printTeam() {
        System.out.println("Team: ");

        for (Employee e : team) {
            System.out.println("-> " + e);
        }
    }

    public void saveTeam() {
        try {
            ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream(TEAM));

            oot.writeObject(team);

            oot.flush();
            oot.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(FILE_EXCEPT);
        }
        catch (IOException e) {
            System.out.println(IO_EXCEPT);
        }
    }

    public void loadTeam() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(TEAM));

            team = (Vector<Employee>) ois.readObject();

            ois.close();
        }
        catch (FileNotFoundException e) {
            System.out.println(FILE_EXCEPT);
        }
        catch (IOException e) {
            System.out.println(IO_EXCEPT);
        }
        catch (ClassNotFoundException e) {
            System.out.println(CLASS_EXCEPT);
        }
    }

}
