import java.util.Scanner;

class Animal {

    private int age;
    private String name;

    public Animal() {

    }

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return this.age; }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void grow(){
        this.age++;
    }

    public void printInfo() {
        System.out.println("This animal is " + this.name);
    }
}

class Dog extends Animal {

    private String breed;

    public Dog() {  // empty constructor
        super();
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void setBreed(String breed) { this.breed = breed; }
    public String getBreed() { return this.breed; }

    public void grow() { super.setAge(super.getAge() + 2); }    // overriding method grow

    public void printInfo(String type) {
        System.out.println("This " + type + " is " + super.getName());  // overloading method printInfo
    }

}

public class pr1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Animal a = new Animal("Aza", 2);

        Dog d = new Dog("Qwe", 4, "tre");

        a.printInfo();

        d.printInfo("Haski");
    }
}