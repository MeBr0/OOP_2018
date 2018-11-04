package second;

//tester

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    private Mode current;
    private String adminName;
    private String password;

    private final Scanner SCAN = new Scanner(System.in);
    private final String PATH = "/home/dontnicemebr0/IdeaProjects/lab5/src/second/admin.txt";

    {
        current = Mode.init;
    }

    public Driver() {

    }

    public void begin() {
        String line = SCAN.nextLine();

        if (line.equals("user")) current = Mode.user;

        else if (line.equals("admin")) current = Mode.admin;

        switch (current) {
            case user:
                user();
                break;
            case admin:
                admin();
                break;
        }
    }

    private void user() {

    }

    private void admin() {
        String user = SCAN.nextLine();

        String pass = SCAN.nextLine();

        checkData();

        if (user.equals(adminName) && pass.equals(password)) {

            while (true){
                String line = SCAN.nextLine();

                if (line.equals("exit")) {
                    current = Mode.init;
                    return;
                }

                switch (line) {
                    case "Exit":
                        current = Mode.init;
                        return;
                    case "Textbook":
                        createTextbook();
                        break;
                    case "Instructor":
                        createInstructor();
                        break;
                    case "Course":
                        createCourse();
                        break;
                    default:
                        System.out.println("Enter command again!");
                        break;
                }
            }

        }
        else {
            System.out.println("Access denied!");
            current = Mode.init;
        }
    }

    private void createTextbook() {
        System.out.println("Enter book`s ISBN: ");
        String isbn = SCAN.nextLine();

        System.out.println("Enter book`s title: ");
        String title = SCAN.nextLine();

        System.out.println("Enter book`s author: ");
        String author = SCAN.nextLine();

        Textbook textbook = new Textbook(isbn, title, author);


    }

    private void createInstructor() {

    }

    private void createCourse() {

    }

    private void checkData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(PATH));

            String first = br.readLine();
            String second = br.readLine();

            adminName = first.split(" ")[1];
            password = second.split(" ")[1];

            br.close();
        }
        catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
        catch (IOException ioe) {
            System.out.println("Cannot read from file");
        }
    }
}
