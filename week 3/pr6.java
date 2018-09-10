import java.util.Scanner;

class Converter{
    public String inWords(int num){
        String res = "";

        if (num == 0){
            res = "zero";
        }

        else {
            int first = num / 1000;
            int second = num % 1000;

            if (first != 0) {
                res += this.convertThreeDigits(first) + " thousand";

                if (first % 10 != 1){
                    res += "s";
                }

                res += " ";
            }
            if (second != 0) {
                res += this.convertThreeDigits(second);
            }
        }

        return res;
    }

    private String convertThreeDigits(int num) {
        String res = "";

        int first = num / 100;
        int second = num / 10 % 10;
        int third = num % 10;

        if (first != 0) {
            res += this.convertDigit(first) + " hundred";

            if (first % 10 != 1){
                res += "s";
            }

            res += " ";

            if (second != 0 || third != 0){
                res += "and ";
            }
        }

        if (second == 1) {
            res += this.convertSecondDigits(third);
        }
        else {
            if (second != 0) {
                res += this.convertSecondDigit(second);
            }

            if (third != 0) {
                if (second != 0){
                    res += " ";
                }

                res += this.convertDigit(third);
            }
        }

        return res;
    }

    private String convertDigit(int num){
        String res = "";

        switch (num){
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

    private String convertSecondDigit(int num){
        String res = "";

        switch (num){
            case 2:
                res = "twenty";
                break;
            case 3:
                res = "thirty";
                break;
            case 4:
                res = "fourty";
                break;
            case 5:
                res = "fifty";
                break;
            case 6:
                res = "sixty";
                break;
            case 7:
                res = "seventy";
                break;
            case 8:
                res = "eighty";
                break;
            case 9:
                res = "ninety";
                break;
        }

        return res;
    }

    private String convertSecondDigits(int num){
        String res = "";

        switch (num){
            case 0:
                res = "ten";
                break;
            case 1:
                res = "eleven";
                break;
            case 2:
                res = "twelve";
                break;
            case 3:
                res = "thirteen";
                break;
            case 4:
                res = "fourteen";
                break;
            case 5:
                res = "fifteen";
                break;
            case 6:
                res = "sixteen";
                break;
            case 7:
                res = "seventeen";
                break;
            case 8:
                res = "eighteen";
                break;
            case 9:
                res = "nineteen";
                break;
        }

        return res;
    }
}

public class pr6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        Converter conv = new Converter();

        System.out.println(conv.inWords(a));
    }
}