import java.util.Scanner;

public class pr6{
    private static String convertDigit(int n){
        String res = "";

        switch (n){
            case 1:
                res = "one";
                break;
            case 2:
                res = "two";
                break;
            case 3:
                res = "three";
                break;
            case 4:
                res = "four";
                break;
            case 5:
                res = "five";
                break;
            case 6:
                res = "six";
                break;
            case 7:
                res = "seven";
                break;
            case 8:
                res = "eight";
                break;
            case 9:
                res = "nine";
                break;
        }

        return res;
    }

    public static String inWords(int number){
        int[] digits = new int[5];

        String res = "";

        for (int i = 0; i < digits.length; ++i){
            digits[i] = number % 10;

            System.out.print(digits[i]);

            number /= 10;
        }

        if (digits[4] != 0){
            res +=
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        RuleBasedNumberFormat nf = new RuleBasedNumberFormat(Locale.forLanguageTag("en"));

        int a = scan.nextInt();

        inWords(a);
    }
}