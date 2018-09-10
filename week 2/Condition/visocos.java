import java.util.Scanner;

public class visicos{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
