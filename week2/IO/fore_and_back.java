import java.util.Scanner;

public class fore_and_back{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");

    }
}
