package third;

import java.util.ArrayList;
import java.util.Date;

public class Manager extends Employee {
    private ArrayList<Employee> team;
    private int bonus;

    {
        bonus = 0;
        team = new ArrayList<Employee>();
    }

    public Manager() { super(); }

    public Manager(String name, int id) { super(name, id); }

    public Manager(String name, int id, ArrayList<Employee> team) {
        super(name, id);

        this.team = team;
    }

    public Manager(String name, int id, double salary, Date hireDate, String insuranceNumber, ArrayList<Employee> team){
        super(name, id, salary, hireDate, insuranceNumber);

        this.team = team;
    }

    public ArrayList<Employee> getTeam() { return team; }
    public void setTeam(ArrayList<Employee> team){ this.team = team; }

    public int getBonus() { return bonus; }
    public void setBonus(int bonus) { this.bonus = bonus; }

    public void addEmployee(Employee e) {
        this.team.add(e);
    }

    public void addBonus(int a){
        this.bonus += a;
    }

    @Override
    public String toString() {
        String team = "Team: [";

        for (int i = 0; i < this.team.size(); i++) {
            team += this.team.get(i).getName();

            if (i == this.team.size() - 1){
                break;
            }

            team += ", ";
        }

        team += "], ";

        return String.format("%s, Team: %s, Bonus: %d", super.toString(), team, this.bonus);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Manager){

            Manager other = (Manager) o;

            boolean a = this.team.equals(other.getTeam());
            boolean b = (this.bonus == other.bonus);

            return a & b & super.equals(o);
        }
        else {
            return false;
        }
    }

    @Override
    protected Manager clone() throws CloneNotSupportedException {
        return (Manager) super.clone();
    }

    @Override
    public int compareTo(Object o) {
        Manager other = (Manager) o;

        if (super.compareTo(o) == 0) {
            return Integer.compare(this.bonus, other.bonus);
        }
        else return super.compareTo(o);
    }
}
