import java.util.Scanner;

public class reminder{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        for (int i = a; i <= b; ++i){
            if (i % d == c){
                System.out.print(i);
                System.out.print(' ');

            }
        }

    }
}
