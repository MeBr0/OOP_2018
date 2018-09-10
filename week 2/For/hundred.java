import java.util.Scanner;

public class hundred{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        //        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int cnt = 0;

        for (int i = 0; i < 100; ++i){
            cnt += scan.nextInt();
        }

        System.out.print(cnt);

    }
}

