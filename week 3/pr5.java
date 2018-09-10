import java.util.Scanner;

public class pr5{

    private static int[] repeat(int[] nums){
        int[] res = new int[2 * nums.length];

        for(int i = 0; i < nums.length; ++i){
            for (int j = 0; j < 2; ++j){
                res[2 * i + j] = nums[i];
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; ++i){
            arr[i] = scan.nextInt();
        }

        int res[] = repeat(arr);

        for (int i = 0; i < res.length; ++i){
            System.out.print(res[i] + " ");
        }

        System.out.print("\n");
    }
}