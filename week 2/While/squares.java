import java.util.Scanner;

public class squares{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //        int b = scan.nextInt();
        //        int c = scan.nextInt();
        //        int d = scan.nextInt();

        int i = 1;

        while (i <= a){
            if ((int)Math.sqrt(i) * (int)Math.sqrt(i) == i){
                System.out.println(i);
            }

            i++;
        }


    }
}
