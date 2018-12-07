package pr3;

import java.util.Vector;

public class Tester {

    public void begin() {
        Employee e1 = new Employee("Aza", 123);
        Employee e2 = new Employee("Qwe", 233);
        Employee e3 = new Employee("Asd", 333);

        e2.raiseSalary(33);

        Vector<Employee> team = new Vector<>();

        team.add(e1);
        team.add(e2);
        team.add(e3);

        Manager m = new Manager("Java", 99999, team, 0);

        m.setBonus(4);

        m.printTeam();

        m.saveTeam();

//        Thread.NORM_PRIORITY/**/
    }
}
