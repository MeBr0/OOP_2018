package Condition;

import java.util.Scanner;

public class greater{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > b){
            System.out.println(1);
        }
        else if (a < b){
            System.out.println(2);
        }
        else if (a == b){
            System.out.println(0);
        }

    }
}
