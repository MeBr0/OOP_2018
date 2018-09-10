import java.util.Scanner;

public class squares{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        for (int i = a; i <= b; ++i){
            if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
                System.out.print(i);
                System.out.print(' ');

            }
        }

    }
}
