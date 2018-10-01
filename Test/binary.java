import java.util.Scanner;

public class binary{

    private static int convert(String s){
        int sum = 0;
        int pow = 0;

        for (int i = s.length() - 1; i > -1; --i){
            int n = s.charAt(i) - 48;

//            System.out.println(n);

            if (n == 1){
                sum += Math.pow(2, pow);
            }

            pow++;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String n = s.nextLine();

        System.out.println(convert(n));
    }
}