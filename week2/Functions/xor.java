import java.util.Scanner;

public class xor{
    private static int pow(int a, int b){
        if (a == b) return 0;

        return 1;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        System.out.print(pow(a, b));



    }
}
