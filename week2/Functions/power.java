import java.util.Scanner;

public class power{
    private static double pow(double a, int b){
        if (a == 0 && b == 0){
            return 1;
        }
        else if (a == 0){
            return 0;
        }
        else if (b == 0){
            return 1;
        }

        double q = 1;

        for (int i = 0; i < b; i++){
            q *= a;
        }

        return q;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        System.out.print(pow(a, b));



    }
}

