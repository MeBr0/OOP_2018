import java.util.Scanner;

class StarTriangle{
    private int width;

    private final String SIGN = "[*]";

    StarTriangle(int width){
        this.width = width;
    }

    public String toString(){
        String res = "";

        for (int i = 0; i < width; ++i){
            for (int j = 0; j <= i; ++j){
                res += this.SIGN;
            }

            res += "\n";
        }

        return res;
    }
}

public class pr2{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();

        StarTriangle tr1 = new StarTriangle(i);

        System.out.println(tr1);
    }
}