import java.util.Scanner;

class Student{
    private String name;
    private int id;
    private int yearOfStudy;

    Student(String name, int id){
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return this.name;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public int getId(){
        return this.id;
    }
    public int getYearOfStudy(){
        return this.yearOfStudy;
    }

    public void nextYear(){
        this.yearOfStudy++;
    }

    public String toString(){
        return "Name: " + this.name + " Id: " + this.id + " Year of study: " + this.yearOfStudy;
    }
}

public class pr1{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Student s1 = new Student("Qwe",5);

        System.out.println(s1.getId());
        System.out.println(s1.getName());
        System.out.println(s1.getYearOfStudy());

        Student s2 = new Student("Aza", 3);

        System.out.println(s1);
        System.out.println(s2);
    }
}