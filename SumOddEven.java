
import java.util.Scanner;

public class SumOddEven {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        int evenSum = 0, oddSum = 0;

        while (n-- >= 0)
            nums[n] = sc.nextInt();

        while (++n < nums.length) { 
            if (nums[n] % 2 == 0)
                evenSum += nums[n];
            else 
                oddSum += nums[n];
        }
        
        System.out.println();


        sc.close();
    }
}
